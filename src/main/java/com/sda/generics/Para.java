package com.sda.generics;

public class Para<L, P> {
    L lewy;
    P prawy;

    public L getLewy() {
        return lewy;
    }

    public Para(L lewy, P prawy) {
        this.lewy = lewy;
        this.prawy = prawy;
    }

    public P getPrawy() {
        return prawy;
    }

}
