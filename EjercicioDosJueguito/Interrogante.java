package EjercicioDosJueguito;

public class Interrogante {
     private String enunciado;
     private String respuestaCorrecta;
     
     public Interrogante() {
     }

     public Interrogante(String enunciado, String respuestaCorrecta) {
        this.enunciado = enunciado;
        this.respuestaCorrecta = respuestaCorrecta;
     }

     public String getEnunciado() {
         return enunciado;
     }

     public void setEnunciado(String enunciado) {
         this.enunciado = enunciado;
     }

     public String getRespuestaCorrecta() {
         return respuestaCorrecta;
     }

     public void setRespuestaCorrecta(String respuestaCorrecta) {
         this.respuestaCorrecta = respuestaCorrecta;
     }

     public boolean esCorrecta(String respuestaUsuario) {
        return respuestaUsuario != null
        && respuestaUsuario.trim().equalsIgnoreCase(respuestaCorrecta);
}

}