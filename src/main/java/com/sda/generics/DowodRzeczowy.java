package com.sda.generics;

public class DowodRzeczowy<T extends IEvidence>{
    T dowod;
    String opis;

    public DowodRzeczowy(T dowod, String opis) {
        this.dowod = dowod;
        this.opis = opis;
    }

    public T getDowod() {

        return dowod;
    }

    public void setDowod(T dowod) {
        this.dowod = dowod;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
