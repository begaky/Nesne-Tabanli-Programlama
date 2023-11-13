package com.example.nesnetabanliprogramlama.inheritance;

public class Araba extends Arac {
    private String kasaTipi;

    public Araba() {
    }

    public Araba(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }

    public String getKasaTipi() {
        return kasaTipi;
    }

    public void setKasaTipi(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }

    public void bilgialAraba(){
        System.out.println(kasaTipi);
        System.out.println(getVitesTipi());
    }
}
