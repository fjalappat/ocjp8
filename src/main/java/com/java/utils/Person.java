package com.java.utils;

public class Person {

    int age;
    String ssnId;
    String name;
    char sex;

    public Person(int age, String ssnId, String name, char sex) {
        this.age = age;
        this.ssnId = ssnId;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSsnId() {
        return ssnId;
    }

    public void setSsnId(String ssnId) {
        this.ssnId = ssnId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", ssnId='" + ssnId + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
