package org.example.oops_1;

public class student {

    int age;
    float psp;
    String name;

    void changebatch(){
        System.out.println("changing batch");
    }
    void joinclass(){
        System.out.println(name + "is joining class");
    }

    void printdetails(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("psp: " + psp);
    }
}
