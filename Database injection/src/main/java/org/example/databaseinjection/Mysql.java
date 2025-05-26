package org.example.databaseinjection;

import org.springframework.stereotype.Component;

@Component
public class Mysql implements Database {
    @Override
    public void persist(String Data) {
        System.out.println("Mysql:" + Data);
    }

}
