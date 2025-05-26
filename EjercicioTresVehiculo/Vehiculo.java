package EjercicioTresVehiculo;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    
    
    public Vehiculo() {
    }
    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void mover() {
        System.out.println("El vehículo se está moviendo.");
}

}