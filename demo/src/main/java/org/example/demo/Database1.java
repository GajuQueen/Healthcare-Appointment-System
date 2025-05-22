package org.example.demo;

public class Database1 implements Operation  {
    @Override
    public void persist(String data){
        System.out.println("data proceed: " + data);
    }
}
