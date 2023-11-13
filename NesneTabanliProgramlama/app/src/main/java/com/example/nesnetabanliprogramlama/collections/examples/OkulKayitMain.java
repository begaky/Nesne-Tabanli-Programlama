package com.example.nesnetabanliprogramlama.collections.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulKayitMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

        while (true) {

            System.out.println("Öğrenci Okul No Giriniz: ");
            int no = scan.nextInt();

            System.out.println("Öğrenci Adını Giriniz: ");
            String isim = scan.next();

            Ogrenci yeniOgrenci = new Ogrenci(no, isim);
            ogrenciler.add(yeniOgrenci);


            System.out.println("Çıkış için 1 / Devam için herhangi bir sayıyı tuşlayınız. ");
            int secim = scan.nextInt();

            if (secim == 1) {

                for (Ogrenci o : ogrenciler
                ) {
                    System.out.println("-------------------");
                    System.out.println("Okul Numarası: " + o.getOkulNo());
                    System.out.println("Ogrenci Adı: " + o.getOgrenciAdı());

                    //kayıtları göster.
                }

                break;

            }
        }
    }
}
