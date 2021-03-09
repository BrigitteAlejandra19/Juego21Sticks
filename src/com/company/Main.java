package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Juego juego = new Juego();


    juego.nivelDificultad();
    boolean ganoJugador = juego.jugar(juego.juegaJugador());
    juego.resultado(ganoJugador);

    }
}
