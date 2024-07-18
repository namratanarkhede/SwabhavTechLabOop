package com.aurionpro.model;


public class SamePackageAnotherClass {
    public void display() {
        BaseClass base = new BaseClass();
        // System.out.println("Private field: " + base.privateField); // Not accessible
        System.out.println("Default field: " + base.defaultField); // Accessible
        System.out.println("Protected field: " + base.protectedField); // Accessible
        System.out.println("Public field: " + base.publicField); // Accessible
    }
}
