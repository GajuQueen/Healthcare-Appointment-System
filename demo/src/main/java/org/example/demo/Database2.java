package org.example.demo;

public class Database2 implements Operation {
    @Override
    public void persist(String data){
        System.out.println("data execute : " + data);
    }
}
