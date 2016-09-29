package com.viafoura.sample.boot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * An implementation of {@link SomeService} as a component to Inject in other classes
 */
@Component
@Profile("fake")
public class SomeServiceFake implements SomeService {
    @Override
    public String getName() {
        return "Sample Fake Some Service Implementation";
    }
}
