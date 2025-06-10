package com.upen;

public class Alien {
    private int age;
    private Computer com;
    public Alien() {
        System.out.println("Alien created");
    }
//    public Alien(int age, Computer lap) {
//        this.age = age;
//        this.lap = lap;
//
//    }
    public int getAge() {
        return age;
    }
public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Alien is coding");
        com.compile();
    }

}
