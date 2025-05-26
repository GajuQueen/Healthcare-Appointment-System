package org.example.databaseinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseInjectionApplication {

    public static void main(String[] args) {

        var context=SpringApplication.run(DatabaseInjectionApplication.class, args);
        User user =context.getBean(User.class);
//        user.add("Gaju Aline");
        user.printsecrets();
    }

}
