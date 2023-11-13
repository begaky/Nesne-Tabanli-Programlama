package com.example.nesnetabanliprogramlama.collections.hashSetExample;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> phones = new HashSet<>();

        phones.add("iphone");
        phones.add("samsung");
        phones.add("huawei");
        phones.add("xiaomi");

        for (String s: phones
             ) {
            System.out.print(s + " - ");
        }
    }
}
