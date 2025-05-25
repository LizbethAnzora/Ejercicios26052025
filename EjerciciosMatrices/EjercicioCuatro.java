import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creamos un arreglo de 10 elementos llamado "numeros"
        int[] numeros = new int[10];

        // Solicitamos al usuario que ingrese los 10 números
        System.out.println("Por favor ingrese 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializamos las variables mayor y menor con el primer valor del arreglo
        int mayor = numeros[0];
        int menor = numeros[0];

        // Recorremos el arreglo para encontrar el mayor y el menor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i]; // Actualizamos el valor mayor
            }
            if (numeros[i] < menor) {
                menor = numeros[i]; // Actualizamos el valor menor
            }
        }

        // Mostramos los resultados
        System.out.println("El número mayor es el siguiente: " + mayor);
        System.out.println("El número menor es el siguiente: " + menor);

        scanner.close(); // Cerramos el Scanner
    }

}
