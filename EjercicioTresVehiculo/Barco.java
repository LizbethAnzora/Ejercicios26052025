package EjercicioTresVehiculo;

public class Barco extends Vehiculo {
    public Barco(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    @Override
    public void mover() {
        System.out.println("El barco navega sobre el agua.");

    }
}
