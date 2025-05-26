package EjercicioCincoProfesion;

public class Main {
    public static void main(String[] args) {
        Maestro maestro = new Maestro("Ana", 150, 12.50);
        Arquitecto arquitecto = new Arquitecto("Luis", 180, 18.75);

        System.out.println("Profesión: Maestro");
        System.out.println("Nombre: " + maestro.getNombre());
        System.out.println("Sueldo: $" + maestro.calcularSueldo());

        System.out.println("\nProfesión: Arquitecto");
        System.out.println("Nombre: " + arquitecto.getNombre());
        System.out.println("Sueldo: $" + arquitecto.calcularSueldo());
    }
}