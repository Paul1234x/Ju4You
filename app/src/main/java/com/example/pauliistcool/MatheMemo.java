package com.example.pauliistcool;

public class MatheMemo {
    private String name;
    private int Klasse;
    private long NummeroderEmail;


    public MatheMemo(String name, int Klasse, long NummeroderEmail) {
        this.name = name;
        this.Klasse = Klasse;
        this.NummeroderEmail = NummeroderEmail;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getKlasse() {
        return Klasse;
    }

    public void setKlasse(int Klasse) {
        this.Klasse = Klasse;
    }


    public long getNummeroderEmail() {
        return NummeroderEmail;
    }

    public void setNummeroderEmail(long NummeroderEmail) {
        this.NummeroderEmail = NummeroderEmail;
    }
}
