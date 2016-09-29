package com.viafoura.sample.boot.service.address;

import com.viafoura.sample.boot.domain.Address;

/**
 * Created by sina on 2016-09-26.
 */
public interface AddressService {

    Address save(Address address);

    Address getAddress(Long id);
}
