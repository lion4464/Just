package com.example.demo;

public class MyBean {
    String name;
    int value;
//    public MyBean() {
//        System.out.println("MyBean is initialized!!");
//    }

    public MyBean(String name, int value) {
        this.name = name;
        this.value = value;
        System.out.println("I'm inside saySomething() method.");
    }

    public void saySomething() {
        System.out.println("I'm inside saySomething() method.");
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
