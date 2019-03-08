package com.app.mongodbreactive;

import com.app.mongodbreactive.repository.CompanyRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;




@EnableMongoRepositories("com.app.mongodbreactive")
@SpringBootApplication

public class MongodbreactiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongodbreactiveApplication.class, args);
    }

}

