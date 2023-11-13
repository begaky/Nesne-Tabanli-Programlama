package com.example.nesnetabanliprogramlama;

public class OtobusMain {
    public static void main(String[] args) {
        Otobus otobus1 = new Otobus();

        otobus1.kapasite = 50;
        otobus1.mevcutYolcu = 30;
        otobus1.nereden = "İstanbul";
        otobus1.nereye = "İzmir";

        otobus1.bilgiAl();


    }
}
