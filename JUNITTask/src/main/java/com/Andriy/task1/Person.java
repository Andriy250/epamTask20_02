package com.Andriy.task1;

import java.util.List;

public class Person {
    private StringBuilder name;
    private int age;



    public Person(StringBuilder name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    public String speak(){
        return "Hello, master";
    }

    public <T>int count(List<T> list){
        int i = 0;
        for (T t : list) i++;
        return i;
    }

    public void test(int i){}

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
