package EjercicioCincoProfesion;

public class Arquitecto implements Profesion {
    private String nombre;
    private int proyectosRealizados;
    private double pagoPorProyecto;
    
    public Arquitecto() {
    }
    
    public Arquitecto(String nombre, int proyectosRealizados, double pagoPorProyecto) {
        this.nombre = nombre;
        this.proyectosRealizados = proyectosRealizados;
        this.pagoPorProyecto = pagoPorProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProyectosRealizados() {
        return proyectosRealizados;
    }

    public void setProyectosRealizados(int proyectosRealizados) {
        this.proyectosRealizados = proyectosRealizados;
    }

    public double getPagoPorProyecto() {
        return pagoPorProyecto;
    }

    public void setPagoPorProyecto(double pagoPorProyecto) {
        this.pagoPorProyecto = pagoPorProyecto;
    }

    @Override
    public double calcularSueldo() {
        return proyectosRealizados * pagoPorProyecto;
    }
}
