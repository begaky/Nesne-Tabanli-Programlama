package com.example.nesnetabanliprogramlama.collections.arraylistExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NesneMain {

    public static void main(String[] args) {

        List<Student> objects = new ArrayList<>();

        Student s1 = new Student(4521, "Begum");
        Student s2 = new Student(2134, "Batuhan");
        Student s3 = new Student(9826, "Ali");
        Student s4 = new Student(4781, "Zeynep");

        objects.add(s1);
        objects.add(s2);
        objects.add(s3);
        objects.add(s4);

        Collections.sort(objects); //Tc No ları küçükten büyüğe sıraladı.


        for (Student s: objects
             ) {
            System.out.println("**********");
            System.out.println("TC No: " + s.getOkulNo());
            System.out.println("Student Name: " + s.getName());
            System.out.println("**********");
        }
    }
}
