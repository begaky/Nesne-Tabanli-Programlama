package com.example.nesnetabanliprogramlama.ödevler.ödev4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Personel> personeller = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + ". Personel adı: ");
            String isim = scan.next();

            System.out.println((i+1)+ ". Personel adres il:");
            String il = scan.next();

            System.out.println((i+1) + ". Personel adres ilçe: ");
            String ilce = scan.next();

            Adres yeniAdres = new Adres(il,ilce);
            Personel yeniPersonel = new Personel(i+1, isim, yeniAdres);
            personeller.add(yeniPersonel);
        }

        for (Personel p: personeller
             ) {
            System.out.println("---------------");
            System.out.println("Personel No: " + p.getPersonelNo());
            System.out.println("Personel İsim: " + p.getName());
            System.out.println("------Adres---------");
            System.out.println("Personel İl: " + p.getAdres().getIl());
            System.out.println("Personel İlçe: " + p.getAdres().getIlce());
        }

    }
}
