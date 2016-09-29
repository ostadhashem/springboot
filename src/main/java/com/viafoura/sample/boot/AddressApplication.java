package com.viafoura.sample.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.Optional;

@SpringBootApplication
@ComponentScan
@PropertySource("classpath:/application.yml")
public class AddressApplication {

    private static Logger logger = LoggerFactory.getLogger(AddressApplication.class);

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(AddressApplication.class, args);
        if (args.length > 0) {
//            applicationContext.getEnvironment().setActiveProfiles(args[0]);
            logger.info("The active profile(s): " + Arrays.toString(applicationContext.getEnvironment().getActiveProfiles()));
        }

    }
}
