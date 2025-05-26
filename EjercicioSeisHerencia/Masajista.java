package EjercicioSeisHerencia;

public class Masajista extends Persona {
     private String titulacion;
     private Integer aniosExperiencia;
    
     public Masajista() {
     }
     
     public Masajista(Integer id, String nombre, String apellidos, Integer edad, String titulacion,
            Integer aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
     }

     public String getTitulacion() {
         return titulacion;
     }

     public void setTitulacion(String titulacion) {
         this.titulacion = titulacion;
     }

     public Integer getAniosExperiencia() {
         return aniosExperiencia;
     }

     public void setAniosExperiencia(Integer aniosExperiencia) {
         this.aniosExperiencia = aniosExperiencia;
     }

     public void darMasaje() {
        System.out.println(getNombre() + " da un masaje profesional.");
    }
}
