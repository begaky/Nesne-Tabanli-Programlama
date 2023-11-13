package com.example.nesnetabanliprogramlama;

public class RenklerFinalExp {
    public static final int BEYAZ = 1111;
    public static final int SIYAH = 0000;

    public void boya(int renkTercihi){
        if (renkTercihi == 1111){
            System.out.println("Beyaza boyandı.");
        }
        if (renkTercihi == 0000){
            System.out.println("Siyaha boyandı.");
        }
    }

}
