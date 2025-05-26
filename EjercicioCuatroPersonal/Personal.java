package EjercicioCuatroPersonal;

public abstract class Personal {
    private String nombre;
    private double salarioBase;
    
    public Personal() {
    }

    public Personal(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract void registrar();
    public abstract double calcularSueldo();
}


