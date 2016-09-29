package com.viafoura.sample.boot.service.address;

import com.viafoura.sample.boot.domain.Address;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by sina on 2016-09-29.
 */
@Component
@Profile({"default","dev","prod"})
public class AddressServiceImpl implements AddressService {
    @Override
    public Address save(Address address) {
        return null;
    }

    @Override
    public Address getAddress(Long id) {
        return null;
    }
}
