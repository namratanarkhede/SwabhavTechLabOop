package com.aurionpro.test;

import com.aurionpro.model.BaseClass;

public class DifferentPackageSubclass extends BaseClass {
    public void display() {
        // System.out.println("Private field: " + privateField); // Not accessible
        // System.out.println("Default field: " + defaultField); // Not accessible
        System.out.println("Protected field: " + protectedField); // Accessible
        System.out.println("Public field: " + publicField); // Accessible
    }
}