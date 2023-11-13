package com.example.nesnetabanliprogramlama.ödevler.ödev4;

public class Personel {
    private int personelNo;
    private String name;

    private Adres adres;

    public Personel() {
    }

    public Personel(int personelNo, String name, Adres adres) {
        this.personelNo = personelNo;
        this.name = name;
        this.adres = adres;
    }

    public int getPersonelNo() {
        return personelNo;
    }

    public void setPersonelNo(int personelNo) {
        this.personelNo = personelNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}
