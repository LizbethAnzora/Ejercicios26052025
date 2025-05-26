package EjercicioTresVehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] flota = {
            new Automovil("Toyota", "Hilux", "gris"),
            new Barco("Lagoon", "52 Fly", "blanco"),
            new Avion("Korean Air", "A350-941", "celeste")
        };

        // Polimorfismo: todos llamamos mover(), pero cada clase lo implementa a su manera
        for (Vehiculo v : flota) {
            System.out.print(v.getClass().getSimpleName() + ": ");
            v.mover();
        }
    }

}
