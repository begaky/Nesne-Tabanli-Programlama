package com.example.nesnetabanliprogramlama.composition;

public class Filmler {
    private int filmId;
    private String filmAd;
    private int filmYil;
    private Kategoriler kategori;
    private Yonetmenler yonetmen;

    public Filmler() {
    }

    public Filmler(int filmId, String filmAd, int filmYil, Kategoriler kategori, Yonetmenler yonetmen) {
        this.filmId = filmId;
        this.filmAd = filmAd;
        this.filmYil = filmYil;
        this.kategori = kategori;
        this.yonetmen = yonetmen;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmAd() {
        return filmAd;
    }

    public void setFilmAd(String filmAd) {
        this.filmAd = filmAd;
    }

    public int getFilmYil() {
        return filmYil;
    }

    public void setFilmYil(int filmYil) {
        this.filmYil = filmYil;
    }

    public Kategoriler getKategori() {
        return kategori;
    }

    public void setKategori(Kategoriler kategori) {
        this.kategori = kategori;
    }

    public Yonetmenler getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(Yonetmenler yonetmen) {
        this.yonetmen = yonetmen;
    }
}
