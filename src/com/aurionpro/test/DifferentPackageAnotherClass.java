package com.aurionpro.test;

import com.aurionpro.model.BaseClass;

public class DifferentPackageAnotherClass {
    public void display() {
        BaseClass base = new BaseClass();
        // System.out.println("Private field: " + base.privateField); // Not accessible
        // System.out.println("Default field: " + base.defaultField); // Not accessible
        // System.out.println("Protected field: " + base.protectedField); // Not accessible
        System.out.println("Public field: " + base.publicField); // Accessible
    }
}