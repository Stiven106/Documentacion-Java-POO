package POO3.Constantes;
// Encontraras: uso de la palabra final.
public class Constantes {
    private final String nombre; // La palabra final indica que la variable es constante, por tanto no podra cambiar de valor.
    private int edad;

    // Constructor

    public Constantes(String _nombre, int _edad) {

        this.nombre = _nombre;
        this.edad = _edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
