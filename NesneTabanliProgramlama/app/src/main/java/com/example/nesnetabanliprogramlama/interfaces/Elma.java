package com.example.nesnetabanliprogramlama.interfaces;

public class Elma implements Eatable,Squueezable {
    @Override
    public void howToEat() {
        System.out.println("Yıkayıp ye.");
    }

    @Override
    public void howToSquueeze() {
        System.out.println("Soy ve suyunu çıkar.");
    }
}
