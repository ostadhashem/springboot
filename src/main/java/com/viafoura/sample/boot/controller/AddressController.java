package com.viafoura.sample.boot.controller;

import com.viafoura.sample.boot.domain.Address;
import com.viafoura.sample.boot.message.AddressMessage;
import com.viafoura.sample.boot.service.SomeService;
import com.viafoura.sample.boot.service.address.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;

/**
 * This is a sample Controller which is working with a someService
 * , exchangeable by different profile
 */

@Controller
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    SomeService someService;

    @Autowired
    AddressService addressService;

    @GetMapping("/name")
    public String getName() {
        return someService.getName();
    }

    @GetMapping(path = "/{id}")
    public Address getAddress(@PathVariable Long id) {
        return addressService.getAddress(id);
    }

    @PostMapping("/")
    public ResponseEntity<?> save(@Valid @RequestBody AddressMessage addressMessage) {
        HttpHeaders httpHeaders = new HttpHeaders();

        Address savedAddress = addressService.save(new Address());
        httpHeaders.setLocation(URI.create("/address/"+savedAddress.getId()));
        return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
    }


}
