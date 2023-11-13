package com.example.nesnetabanliprogramlama.override;

public class PolymorMain {
    public static void main(String[] args) {

        Hayvan hayvan = new Kedi();
        //hayvan nesnesinin içinde kedinin özellikleri vardır.

        hayvan.sesCikar();
    }
}
