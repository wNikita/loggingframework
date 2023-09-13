package com.example.loggingframework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private static final Logger logger = LoggerFactory.getLogger(MyService.class);

    public void doSomething() {
        logger.debug("Debug message from MyService");
        logger.info("Info message from MyService");
        logger.warn("Warning message from MyService");
        logger.error("Error message from MyService");
    }
}
