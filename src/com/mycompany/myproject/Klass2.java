package com.mycompany.myproject;

public class Klass2 {
    private Klass1 klass1;

    public Klass2(Klass1 klass1) {
        this.klass1 = klass1;
    }

    public void skrivUtMeddelande() {
        System.out.println(klass1.getMeddelande());
    }
}
