package com.example.nesnetabanliprogramlama.ödevler.ödev2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("begüm");
        isimler.add("batuhan");
        isimler.add("ali");
        isimler.add("dudu");
        

        Scanner scan = new Scanner(System.in);
        System.out.println("İsim giriniz: ");
        String isim = scan.next();

        boolean isimBulundu = false;


        for (String s: isimler
             ) {
            if (s.equalsIgnoreCase(isim)){
                isimBulundu = true;
                break;
            }
        }

        if (isimBulundu){
            System.out.println("isim listede mevcut.");
        }else{
            System.out.println("isim mevcut değil.");
        }

    }
}
