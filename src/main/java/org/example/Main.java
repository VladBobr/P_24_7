package org.example;

public class Main {
    public static void main(String[] args) {

        University u = new University();
        Student s = new Student( u );

        System.out.println(u);
        System.out.println(s);
    }
}