package com.company;

import java.util.Random;
import java.util.Scanner;

public class Juego {


    Scanner sc = new Scanner(System.in);

    private Integer contadorPalitos = 21;

    private Dificultad dificualtad;

    public void nivelDificultad(){
        System.out.println("Que nivel de dificultad prefieres: ");
        String dificultad = sc.nextLine();
        for (Dificultad d: Dificultad.values()){
            System.out.println("Dificultad: " +d+ ": "+d.getNivel());
        }
         switch (dificualtad){
             case FACIL:
                 System.out.println("Ok juguemos facil");
             case MEDIO:
                 System.out.println("");
             case DIFICIL:
                 System.out.println("");
         }

    }

    public boolean juegaJugador() {

        System.out.println("¿Querés jugar primero? (Si / No): ");
        String jugarPrimero = sc.nextLine();
        if ("Si".equalsIgnoreCase(jugarPrimero)) {
            System.out.println("Ok, es tu turno!");
            return true;
        } else {
            System.out.println("Ok, es el turno de la computadora!");
            return false;
        }
    }

    public boolean jugar(boolean turnoJugador) {

        while (contadorPalitos > 0) {
            if (turnoJugador) turnoJugador();
            else turnoPC();

            turnoJugador = !turnoJugador;
        }

        return !turnoJugador;
    }

    public void turnoJugador() {
        System.out.println("Tu turno: ¿cuántos palitos querés sacar? (1 o 2): ");
        int cantidadPalitosJugador = sc.nextInt();
        if (cantidadPalitosJugador > 2 || cantidadPalitosJugador <= 0) {
            System.out.println("Solo puede jugar 1 o 2 palitos por turno!");
        } else
            contadorPalitos -= cantidadPalitosJugador;
        System.out.println("Quedan: " + contadorPalitos);
    }

    public void turnoPC() {

        int turnoPC = calularPalitosPC();
        System.out.println("Turno PC: " + turnoPC + " palitos");
        contadorPalitos -= turnoPC;
        System.out.println("Quedan: " + contadorPalitos);
    }

    public void resultado(boolean perdioJugador) {
        String perdedor = perdioJugador? "jugador" : "PC";
        System.out.println("El perdedor es: "+perdedor);

    }

    private int calularPalitosPC(){

        if (contadorPalitos > 3){
            Random random = new Random();
            return random.nextInt(2)+1;
        }

        if (contadorPalitos==3)
            return 2;

        return 1;
    }
}




