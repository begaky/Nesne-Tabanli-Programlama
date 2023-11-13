package com.example.nesnetabanliprogramlama;

public class MatematikMain {

    //Geri Dönüş Değeri Olmayan
    public static void main(String[] args) {
        Matematik mat1 = new Matematik();
        mat1.carpma(5,2);

        int gelenDeger = mat1.topla(3,2);
        System.out.println("Toplam: " + gelenDeger);

        int gelenDeger2 = mat1.cikarma(10,4,"Begüm");
        System.out.println("Çıkarma: " + gelenDeger2);
    }
}
