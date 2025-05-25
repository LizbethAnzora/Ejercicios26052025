package EjercicioUnoAnimal;

public class Main {
    public static void main(String[] args) {
// Creación de objetos de tipo Animal
    Animal animal1 = new Animal("Gato", "Carnívoro", 4);
    Animal animal2 = new Animal("Perico", "Ave", 2);
    Animal animal3 = new Animal("Mariposa", "Insecto", 6);

// Mostrar datos
    animal1.mostrarDatos();
    animal2.mostrarDatos();
    animal3.mostrarDatos();
}

}