package org.example.databaseinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;




@Component
public class User {

    @Value("${name}")
    private String name;
    @Value("${password}")
    private String password;
    @Value("${database}")
    private String database;

    public void printsecrets(){
        System.out.println(name);
        System.out.println(password);
        System.out.println(database);
    }

//    @Autowired
//    @Qualifier("postgres")
//    public Database database;
//
//    public void add(String data) {
//        database.persist(data);
//    }

}
