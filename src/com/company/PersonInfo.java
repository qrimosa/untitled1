package com.company;

public class PersonInfo {
    int age;
    String name;

    PersonInfo(){}

    void info(){
        System.out.println();
    }
    public PersonInfo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
