package com.ltp.hellospring.pojo;

import java.util.UUID;

public class Contact {
    private String name;
    private int age;
    private String id;

    public Contact(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", age='" + getAge() + "'" +
                "}";
    }

}
