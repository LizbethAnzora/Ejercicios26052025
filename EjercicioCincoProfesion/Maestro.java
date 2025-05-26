package EjercicioCincoProfesion;

public class Maestro implements Profesion {
    private String nombre;
    private int clasesImpartidas;
    private double pagoPorClase;
    
    public Maestro() {
    }
    
    public Maestro(String nombre, int clasesImpartidas, double pagoPorClase) {
        this.nombre = nombre;
        this.clasesImpartidas = clasesImpartidas;
        this.pagoPorClase = pagoPorClase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClasesImpartidas() {
        return clasesImpartidas;
    }

    public void setClasesImpartidas(int clasesImpartidas) {
        this.clasesImpartidas = clasesImpartidas;
    }

    public double getPagoPorClase() {
        return pagoPorClase;
    }

    public void setPagoPorClase(double pagoPorClase) {
        this.pagoPorClase = pagoPorClase;
    }

    @Override
    public double calcularSueldo() {
        return clasesImpartidas * pagoPorClase;
    }

}
