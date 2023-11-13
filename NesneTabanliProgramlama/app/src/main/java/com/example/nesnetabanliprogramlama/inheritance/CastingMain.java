package com.example.nesnetabanliprogramlama.inheritance;

public class CastingMain {
    public static void main(String[] args) {
        Subaru subaru = new Subaru();

        //up
        Araba araba1 = new Subaru(); //subaru arabaya dönüştü.

        //down
        Subaru subaru1 = (Subaru) araba1;

    }
}
