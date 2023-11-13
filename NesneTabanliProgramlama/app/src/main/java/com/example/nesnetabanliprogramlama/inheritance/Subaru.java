package com.example.nesnetabanliprogramlama.inheritance;

public class Subaru extends Araba{
    private String motorHacmi;

    public Subaru(){

    }

    public Subaru(String motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public Subaru(String kasaTipi, String motorHacmi) {
        super(kasaTipi);
        this.motorHacmi = motorHacmi;
    }

    public String getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(String motorHacmi) {
        this.motorHacmi = motorHacmi;
    }
}
