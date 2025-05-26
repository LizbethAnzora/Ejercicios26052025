package EjercicioTresVehiculo;

public class Automovil extends Vehiculo{
    public Automovil(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    @Override
    public void mover() {
        System.out.println("El automóvil marcha por la carretera.");
    }
}
