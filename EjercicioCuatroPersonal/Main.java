package EjercicioCuatroPersonal;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Marvin Trigueros", 1141.0 , 30.0, 12);
        empleado.registrar();
        double sueldoTotal = empleado.calcularSueldo();
        System.out.println("El sueldo total del empleado es de: $" + sueldoTotal);
    }

}
