import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos una matriz de 3 filas y 3 columnas para almacenar 9 artículos
        String[][] articulos = new String[3][3];

        System.out.println("Por favor ingrese 9 nombres de artículos:");

        // Llenamos la matriz con nombres de artículos
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Artículo en fila " + fila + ", columna " + col + ": ");
                articulos[fila][col] = scanner.nextLine();
            }
        }

        // Mostramos la matriz con las filas en orden invertido
        System.out.println("Este es el contenido de la matriz con las filas invertidas:");
        for (int fila = 2; fila >= 0; fila--) {  // Invertimos el orden de las filas
            System.out.println("Fila " + fila + ":");
            for (int col = 0; col < 3; col++) {
                System.out.println("  Columna " + col + ": " + articulos[fila][col]);
            }
        }

        scanner.close();
    }

}
