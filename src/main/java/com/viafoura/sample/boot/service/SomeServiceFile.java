package com.viafoura.sample.boot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by sina on 2016-09-26.
 */

@Component
@Profile({"default","dev","prod"})
public class SomeServiceFile implements SomeService {


    @Value("${name}")
    private String name;


    @Override
    public String getName() {
        return name;
    }
}
