package EjercicioCuatroPersonal;

public class Empleado extends Personal{
    private double bonoPorHora;
    private int horasExtras;
    
    public Empleado() {
    }

    public Empleado(String nombre, double salarioBase, double bonoPorHora, int horasExtras) {
        super(nombre, salarioBase);
        this.bonoPorHora = bonoPorHora;
        this.horasExtras = horasExtras;
    }

     @Override
    public void registrar() {
        System.out.println("Registrando al empleado: " + getNombre());
        System.out.println("El salario base es de: $" + getSalarioBase());
    }

    @Override
    public double calcularSueldo() {
        return getSalarioBase() + (bonoPorHora * horasExtras);
    }

}
