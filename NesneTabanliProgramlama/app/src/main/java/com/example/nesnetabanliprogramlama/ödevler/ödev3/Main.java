package com.example.nesnetabanliprogramlama.ödevler.ödev3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int sayi = random.nextInt(101);

        System.out.println("Üretilen sayi = " + sayi);

        ArrayList<Integer> tahminiSayilar = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            System.out.println((i+1)+ ". tahmini giriniz: ");
            int tahmin = scan.nextInt();

            tahminiSayilar.add(tahmin);

            if (tahmin == sayi){
                System.out.println("TEBRİKLER!!");
                break;
            }
            if (tahmin < sayi){
                System.out.println("Tahmini Yükselt.");
            }
            if (tahmin > sayi){
                System.out.println("Tahmini Azalt.");
            }
        }
        System.out.println("--------------");
        System.out.println("üretilen sayı : " + sayi);
        System.out.println("Tahminler : " );

        for (Integer i : tahminiSayilar
             ) {
            System.out.print(i + " - ");
        }


    }
}
