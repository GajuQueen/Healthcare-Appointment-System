package org.example.demo;

public class User <T extends Operation>{
    T database;
    public User(T database) {
        this.database = database;
//        database = new Database1();
    }
    public void add(String data){
        database.persist(data);
    }
}
