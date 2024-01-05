package com.mycompany.myproject;

public class TestKlass {
    public static void main(String[] args) {
        Klass1 klass1 = new Klass1("Hej, världen!");
        Klass2 klass2 = new Klass2(klass1);
        klass2.skrivUtMeddelande();
    }
}
