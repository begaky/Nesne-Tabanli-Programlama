package com.example.nesnetabanliprogramlama.interfaces;

public class Main {
    public static void main(String[] args) {

        Object aslan = new Aslan(); //polymorphism

        Elma elma = new Elma();

        Eatable tavuk = new Tavuk();

        AmasyaElmasi amasyaElmasi = new AmasyaElmasi();

        Object [] nesneler = new Object[] {aslan,elma,amasyaElmasi,tavuk};

        for (Object o: nesneler) {

            if (o instanceof Eatable){
                ((Eatable) o).howToEat();
            }
            if (o instanceof Squueezable){
                ((Squueezable) o).howToSquueeze();
            }

        }

    }
}
