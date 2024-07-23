package com.aurionpro.test;

//Inner classes are classes defined within another class. 
//They can be used to logically group classes that are only used in one place, increase encapsulation, and improve readability and maintainability of the code.

public class OuterClass {
    private String outerField = "Outer Class Field";

    public class InnerClass {
        public void display() {
            System.out.println("Inner Class accessing: " + outerField);
        }
    }

    public void createInnerInstance() {
        InnerClass inner = new InnerClass();
        inner.display();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInnerInstance();
    }
}