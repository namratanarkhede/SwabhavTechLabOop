package com.aurionpro.model;


public class SamePackageSubclass extends BaseClass {
    public void display() {
        // System.out.println("Private field: " + privateField); // Not accessible
        System.out.println("Default field: " + defaultField); // Accessible
        System.out.println("Protected field: " + protectedField); // Accessible
        System.out.println("Public field: " + publicField); // Accessible
    }
}