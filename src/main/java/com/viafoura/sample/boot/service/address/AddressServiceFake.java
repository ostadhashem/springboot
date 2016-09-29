package com.viafoura.sample.boot.service.address;

import com.viafoura.sample.boot.domain.Address;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by sina on 2016-09-26.
 */
@Component
@Profile("fake")
public class AddressServiceFake implements AddressService {
    @Override
    public Address save(Address address) {
        address.setId(10L);
        return address;
    }

    @Override
    public Address getAddress(Long id) {
        Address address = new Address();
        address.setAddress("12 King West");
        address.setName("Viafoura");
        address.setPostalCode("M2L 5BD");
        address.setId(12L);
        return address;
    }
}
