package com.Andriy.task1;

import java.util.List;

public class Creature {
    private String name;
    private int age;



    public Creature(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String speak(){
        return "Hello, master";
    }

    public <T>int count(List<T> list){
        int i = 0;
        for (T t : list) i++;
        return i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
