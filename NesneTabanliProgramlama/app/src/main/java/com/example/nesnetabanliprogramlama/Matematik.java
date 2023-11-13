package com.example.nesnetabanliprogramlama;

public class Matematik {

    //Geri Dönüş Değeri Olmayan
    public void carpma(int x, int y){
        int sonuc = x * y;
        System.out.println("Sonuç: " + sonuc);
    }

    //Geri Dönüş Değeri Olan
    public int topla(int a, int b){
        int toplam = (a) + (b);
        return toplam;
    }

    public int cikarma(int sayi1, int sayi2, String name) {
        int cikarmaSonuc = sayi1 - sayi2;
        System.out.println("İşlemi yapan: " + name);
        return cikarmaSonuc;
    }
}
