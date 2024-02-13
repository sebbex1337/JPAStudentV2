package org.example.jpastudentv2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaStudentV2Application {

    private static final Logger logger = LoggerFactory.getLogger(
            JpaStudentV2Application.class
    );
    public static void main(String[] args) {


        SpringApplication.run(JpaStudentV2Application.class, args);
        logger.info("Application started");
    }

}
