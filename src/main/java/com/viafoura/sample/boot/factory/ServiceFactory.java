package com.viafoura.sample.boot.factory;

import com.viafoura.sample.boot.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by sina on 2016-09-26.
 */
@Configuration
@EnableCaching
@EnableAutoConfiguration
public class ServiceFactory {

    /*
    private static final Logger log = LoggerFactory.getLogger(ServiceFactory.class);

    @Value("${name}")
    private String name;

    @Bean
    @Profile("fake")
    public SomeService someService() {
        return new SomeServiceFake();
    }

    @Bean
    @Profile({"default","dev"})
    public SomeService someServiceFile() {
        return new SomeServiceFile(name);
    }
*/

}
