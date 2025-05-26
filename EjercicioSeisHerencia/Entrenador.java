package EjercicioSeisHerencia;

public class Entrenador extends Persona {
    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(Integer id, String nombre, String apellidos, Integer edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println(getNombre() + " dirige el partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(getNombre() + " dirige el entrenamiento.");
    }

}
