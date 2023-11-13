package com.example.nesnetabanliprogramlama.collections.arraylistExample;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> meyveler = new ArrayList<>();

        meyveler.add("elma");
        meyveler.add("armut");
        meyveler.add("portakal");

        System.out.println("Boyut: " + meyveler.size());

        System.out.println(meyveler.get(1));

        meyveler.add("erik");

        //meyveler.remove(1);

        meyveler.add(1,"çilek");

        meyveler.set(2,"vişne");

        for (String s:meyveler
             ) {
            System.out.print(s + " - ");
        }
    }
}
