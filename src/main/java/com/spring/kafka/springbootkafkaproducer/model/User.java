package com.spring.kafka.springbootkafkaproducer.model;

public class User {

    private String name;
    private String family_name;
    

    public User(String name, String family_name) {
        this.name = name;
        this.family_name= family_name;
      
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String family_name() {
        return family_name;
    }

    public void setfamily_name(String family_name) {
        this.family_name = family_name;
    }

    
}