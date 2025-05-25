import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos un arreglo de 12 enteros llamado "numeros"
        int[] numeros = new int[12];

        // Variables para contar los números pares e impares
        int pares = 0;
        int impares = 0;

        // Solicitamos al usuario que ingrese los 12 números
        System.out.println("Por favor ingrese 12 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Guardamos el número ingresado

            // Verificamos si es par o impar usando el operador %
            if (numeros[i] % 2 == 0) {
                pares++; // Aumentamos el contador de pares
            } else {
                impares++; // Aumentamos el contador de impares
            }
        }

        // Mostramos el resultado
        System.out.println("La cantidad de números pares es de " + pares);
        System.out.println("La cantidad de números impares es de: " + impares);

        scanner.close(); // Cerramos el Scanner
    }

}
