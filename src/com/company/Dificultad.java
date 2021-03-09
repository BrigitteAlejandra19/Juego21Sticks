package com.company;

public enum Dificultad {

    FACIL(3), MEDIO(5), DIFICIL(8);

    private int nivel;

    Dificultad(int nivel) {
        this.nivel = nivel;
    }


    public int getNivel() {
        return nivel;
    }
}
