package EjercicioDosJueguito;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntajeTotal = 0;

        // Nivel 1: 4 preguntas
        System.out.println("Nivel 1 ¡Comienza el juego!");
        Interrogante[] nivel1 = {
            new Interrogante("¿Qué ponen las gallinas?", "Huevos"),
            new Interrogante("Es redonda, tiene queso y todos quieren una porción. ¿Qué es?", "Pizza"),
            new Interrogante("¿Cuantas horas tiene un día?", "24"),
            new Interrogante("¿Cuanto es 10 + 5?", "15")
        };
        puntajeTotal += jugarNivel(nivel1, sc);

        // Nivel 2: otras 4 preguntas
        System.out.println("Nivel 2 ¡Comienza el juego!");
       Interrogante[] nivel2 = {
            new Interrogante("¿Cuál es el animal que dice 'miau'?", "Gato"),
            new Interrogante("¿Qué fruta es amarilla y se pela antes de comer?", "Banana"),
            new Interrogante("¿Qué superhéroe usa una capa roja y vuela?", "Superman"),
            new Interrogante("¿Qué usas para ver la hora en tu muñeca?", "Reloj")
        };
        puntajeTotal += jugarNivel(nivel2, sc);

        // Mostrar puntaje final
        System.out.println(" El puntaje acumulado en ambos niveles es de: " + puntajeTotal);
        sc.close();
    }

    private static int jugarNivel(Interrogante[] preguntas, Scanner sc) {
        int puntajeNivel = 0;
        for (Interrogante p : preguntas) {
            System.out.println(p.getEnunciado());
            System.out.print("> ");
            String respuesta = sc.nextLine();
            if (p.esCorrecta(respuesta)) {
                System.out.println("¡Es correcto! tienes +20 puntos.");
                puntajeNivel += 20;
            } else {
                System.out.println("¡Que mal! Es incorrecto. La respuesta correcta es: " 
                                   + p.getRespuestaCorrecta() + " -10 puntos");
                puntajeNivel -= 10;
            }
        }
        System.out.println("El pountaje de este nivel es de: " + puntajeNivel);
        return puntajeNivel;
}

}