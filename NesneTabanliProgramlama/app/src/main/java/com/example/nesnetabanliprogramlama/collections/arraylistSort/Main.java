package com.example.nesnetabanliprogramlama.collections.arraylistSort;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> meyveler = new ArrayList<>();

        meyveler.add("vişne");
        meyveler.add("karpuz");
        meyveler.add("mango");
        meyveler.add("kiraz");

        System.out.println("Boyut: " + meyveler.size());

        Collections.sort(meyveler); //alfabetik sıralama


        for (String s: meyveler
             ) {
            System.out.print(s + " * ");
        }
    }
}
