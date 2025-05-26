package EjercicioTresVehiculo;

public class Avion extends Vehiculo {
    public Avion(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    @Override
    public void mover() {
        System.out.println("El avión vuela por el cielo.");
    }

}
