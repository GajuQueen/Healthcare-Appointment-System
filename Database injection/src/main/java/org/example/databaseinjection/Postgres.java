package org.example.databaseinjection;

import org.springframework.stereotype.Component;

@Component
public class Postgres implements Database {
    @Override
    public void persist(String Data) {
        System.out.println("Mypostgres:" + Data);
    }
}
