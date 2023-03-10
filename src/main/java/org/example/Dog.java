package org.example;

public class Dog {
    private String type;
    private String name;
    private int age;

    public Dog(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
