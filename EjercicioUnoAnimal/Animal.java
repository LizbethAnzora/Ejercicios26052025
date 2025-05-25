package EjercicioUnoAnimal;

public class Animal {
    private String nombre;
    private String orden;
    private int extremidades;
    
    public Animal() {
    }

    public Animal(String nombre, String orden, int extremidades) {
        this.nombre = nombre;
        this.orden = orden;
        this.extremidades = extremidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }

    public void mostrarDatos() {
    System.out.println("Nombre del animal: " + nombre);
    System.out.println("Orden al que pertenece: " + orden);
    System.out.println("Cantidad de extremidades: " + extremidades);
    System.out.println("---------------------------");
}

}
