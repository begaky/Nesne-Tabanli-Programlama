package com.example.nesnetabanliprogramlama.override;

public class Main {
    public static void main(String[] args) {
        Hayvan h = new Hayvan();
        h.sesCikar();

        Memeliler m = new Memeliler();
        m.sesCikar();

        Kopek k = new Kopek();
        k.sesCikar();

        Kedi kedi = new Kedi();
        kedi.sesCikar();
    }
}
