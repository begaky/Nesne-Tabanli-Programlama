package com.example.nesnetabanliprogramlama.collections.hashSetExample;

import com.example.nesnetabanliprogramlama.collections.arraylistExample.Student;

import java.util.HashSet;

public class NesneMain {

    public static void main(String[] args) {

        HashSet<Student> objects = new HashSet<Student>();

        Student s1 = new Student(4521, "Begum");
        Student s2 = new Student(2134, "Batuhan");
        Student s3 = new Student(9826, "Ali");
        Student s4 = new Student(4781, "Zeynep");

        objects.add(s1);
        objects.add(s2);
        objects.add(s3);
        objects.add(s4);

        Student s5 = new Student(4781, "Merve");
        objects.add(s5);



        for (Student s: objects
        ) {
            System.out.println("**********");
            System.out.println("Okul No: " + s.getOkulNo());
            System.out.println("Student Name: " + s.getName());
            System.out.println("**********");
        }
    }
}
