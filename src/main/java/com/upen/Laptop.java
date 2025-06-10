package com.upen;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop created");
    }
    @Override
    public void compile() {
        System.out.println("Laptop is compiling");
    }
}
