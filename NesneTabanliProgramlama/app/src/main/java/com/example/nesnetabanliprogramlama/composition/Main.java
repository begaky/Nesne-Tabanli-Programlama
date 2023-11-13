package com.example.nesnetabanliprogramlama.composition;

public class Main {
    public static void main(String[] args) {
        Kategoriler kategori1 = new Kategoriler(1,"Drama");
        Kategoriler kategori2 = new Kategoriler(2,"Komedi");
        Kategoriler kategori3 = new Kategoriler(3, "Bilim Kurgu");

        Yonetmenler yonetmen1 = new Yonetmenler(2,"Yılmaz Erdogan");

        Filmler film = new Filmler(5,"Vizontele",2009,kategori2,yonetmen1);
        System.out.println("Film id: " + film.getFilmId());
        System.out.println("Film yıl: " + film.getFilmYil());
        System.out.println("Film ad: " + film.getFilmAd());
        System.out.println("Film yönetmen: " + film.getYonetmen().getYonetmenAd());
        System.out.println("Film kategori: " + film.getKategori().getKategoriAd());


    }
}
