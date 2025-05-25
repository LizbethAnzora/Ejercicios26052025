import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][4]; // Matriz de 3 filas y 4 columnas

        // PASO 1: Llenar la matriz con 12 números
        System.out.println("Por favor ingrese 12 números que sean enteros para llenar la matriz que es de 3x4:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 4; col++) {
                System.out.print("Elemento en fila " + fila + ", columna " + col + ": ");
                matriz[fila][col] = scanner.nextInt();
            }
        }

        boolean puntoDeSillaEncontrado = false;

        // PASO 2: Buscar el punto de silla
        for (int fila = 0; fila < 3; fila++) {
            // Buscar el valor mínimo en esta fila
            int minFila = matriz[fila][0];
            int colMin = 0;

            for (int col = 1; col < 4; col++) {
                if (matriz[fila][col] < minFila) {
                    minFila = matriz[fila][col];
                    colMin = col; // guardamos en qué columna está el mínimo
                }
            }

            // PASO 3: Ver si ese mínimo es el mayor en su columna
            boolean esMayorEnColumna = true;
            for (int f = 0; f < 3; f++) {
                if (matriz[f][colMin] > minFila) {
                    esMayorEnColumna = false;
                    break;
                }
            }

            // PASO 4: Si cumple ambas condiciones, es punto de silla
            if (esMayorEnColumna) {
                System.out.println("El punto de silla encontrado es el siguiente:");
                System.out.println("Valor: " + minFila);
                System.out.println("Se encuentra en la ubicación: fila " + fila + ", columna " + colMin);
                puntoDeSillaEncontrado = true;
            }
        }

        if (!puntoDeSillaEncontrado) {
            System.out.println("No se encontró ningún punto de silla en la matriz. Lo sentimos.");
        }

        scanner.close();
    
    }

}
