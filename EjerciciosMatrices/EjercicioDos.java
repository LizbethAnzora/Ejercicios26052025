import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaramos un arreglo de tipo entero con capacidad para 12 elementos
        int[] numeros = new int[12];

        // Variable para acumular la suma de los números ingresados
        int suma = 0;

        // Solicitamos al usuario que ingrese 12 números enteros
        System.out.println("Por favor ingrese 12 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i]; // Se suma cada número al total
        }

        // Calculamos el promedio dividiendo la suma entre la cantidad de números
        double promedio = (double) suma / numeros.length;

        // Mostramos el promedio al usuario
        System.out.println("El promedio de los números ingresados es el siguiente : " + promedio);

        scanner.close();
    }

}
