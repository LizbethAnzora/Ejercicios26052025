package EjercicioSeisHerencia;

public class Futbolista extends Persona {
    private Integer dorsal;
    private String demarcacion;
    
    public Futbolista() {
    }
    
    public Futbolista(Integer id, String nombre, String apellidos, Integer edad, Integer dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void jugarPartido() {
        System.out.println(getNombre() + " juega el partido con dorsal " + dorsal + ".");
    }

    public void entrenar() {
        System.out.println(getNombre() + " entrena en la demarcación " + demarcacion + ".");
    }

}
