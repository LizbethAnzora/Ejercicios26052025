package EjercicioSeisHerencia;

public class Main {
    public static void main(String[] args) {
        Futbolista f = new Futbolista(10, "Luis", "Gómez", 28, 9, "Delantero");
        Entrenador e = new Entrenador(20, "Ana", "Ramírez", 45, "FED-1234");
        Masajista m = new Masajista(30, "Carlos", "Pérez", 35, "Fisioterapia", 7);

        // Comportamientos heredados
        f.concentrarse();
        e.concentrarse();
        m.concentrarse();

        f.viajar();
        e.viajar();
        m.viajar();

        // Comportamientos específicos
        f.jugarPartido();
        f.entrenar();

        e.dirigirPartido();
        e.dirigirEntrenamiento();

        m.darMasaje();
    }

}
