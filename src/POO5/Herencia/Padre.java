package POO5.Herencia;
/*
    La herencia es una forma de reutilizacion de software en la que se crea una nueva clase al absorber los miembros
    de una ya existente.

    Como saber que clase hereda de x clase: La mejor forma es utilizar las palabras "Es un", ejemplo: Un estudiante
    <Es un>a persona, lo cual es cierto. Ahora miremoslo al revez: ¿Una persona <es un> estudiante?, no necesariamente,
    hay muchas personas, y no todas son estudiantes. De esta forma podemos saber que <estudiante> heredaria de <persona>
     */
public class Padre {

protected String nombre; // Recordemos que protected permite que se pueda utilizar el atributo desde la clase, o desde las clases hijas, por eso lo utilizo ahora.
private String apellido;// Dejare estos 2 atributos en private, para mostrar que existen esas dos formas: acceder por el atributo con protected o -
private int edad;       // -o por medio de los metodos accesores (get y set) con private.

    public Padre(String nombre, String apellido, int edad) { // Constructor de la clase padre.
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}
