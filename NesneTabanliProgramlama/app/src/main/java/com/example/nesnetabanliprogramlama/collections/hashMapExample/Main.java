package com.example.nesnetabanliprogramlama.collections.hashMapExample;

import com.example.nesnetabanliprogramlama.collections.arraylistExample.Student;

import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> plakalar = new HashMap<>();

        plakalar.put(9, "AYDIN");
        plakalar.put(34,"İSTANBUL");
        plakalar.put(6,"ANKARA");
        plakalar.put(35,"İZMİR");

        System.out.println(plakalar.get(9));

        Set<Integer> anahtarlar = plakalar.keySet();

        for (Integer i: anahtarlar
             ) {
            System.out.print(plakalar.get(i) + " - " );
        }

        HashMap<Integer, Student> objects = new HashMap<>();

        Student s1 = new Student(4521, "Begum");
        Student s2 = new Student(2134, "Batuhan");
        Student s3 = new Student(9826, "Ali");
        Student s4 = new Student(4781, "Zeynep");

        objects.put(s1.getOkulNo(), s1);
        objects.put(s2.getOkulNo(), s2);
        objects.put(s3.getOkulNo(), s3);
        objects.put(s4.getOkulNo(), s4);

        Set<Integer> okulNolari = objects.keySet();

        for (Integer no : okulNolari
             ) {
            System.out.println("**********");
            System.out.println("Okul No: " + objects.get(no).getOkulNo() );
            System.out.println("Student Name: " + objects.get(no).getName() );
            System.out.println("**********");
        }


    }

}
