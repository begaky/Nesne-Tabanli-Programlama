package com.example.nesnetabanliprogramlama.ödevler.ödev1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(101); //0 ile 100
            number.add(randomNumber);
        }

        Collections.sort(number);

        for (Integer i: number
             ) {
            System.out.println(i);
        }



    }
}
