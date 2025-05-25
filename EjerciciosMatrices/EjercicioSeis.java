import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3]; // Matriz original 3x3

        // Solicitar al usuario que ingrese los 9 valores numéricos
        System.out.println("Por favor ingrese 9 valores numéricos para llenar la matriz que es de 3x3:");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Elemento en fila " + fila + ", columna " + col + ": ");
                matriz[fila][col] = scanner.nextInt();
            }
        }

        // Mostrar la matriz original
        System.out.println("La matriz original (3x3) es la siguiente: ");
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matriz[fila][col] + "\t");
            }
            System.out.println(); // Salto de línea por fila
        }

        // Mostrar la transpuesta de la matriz
        System.out.println("La matriz transpuesta (filas por columnas) es la siguiente: ");
        for (int col = 0; col < 3; col++) {
            for (int fila = 0; fila < 3; fila++) {
                System.out.print(matriz[fila][col] + "\t");
            }
            System.out.println(); // Salto de línea por fila transpuesta
        }

        scanner.close();
    }

}
