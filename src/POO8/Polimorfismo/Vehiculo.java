package POO8.Polimorfismo;

/*
Que es el polimorfismo: En una relacion de tipo herencia, un objeto de la superclase puede almacenar un objeto de cualquiera de sus subclases.

Significa que la clase padre o superclase es compatible con los tipos que derivan de ella, pero no al reves

Poli= "Muchos"
fismo= "Formas"

1. Observa lo siguiente: Observa como la clase padre, "Vehiculo" tiene otras subclases, instanciadas en este paquete.

2. Procede a mirar la clase test, ahi observaras como puedes crear objetos de la clase hija (VDeportivo,VFurgoneta, VTurismo), dentro de un objeto
de la clase Padre (Vehiculo)
 */

public class Vehiculo {

    protected String matricula;
    protected String marca;
    protected String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String mostrarDatos() {
        return "Marca: " + marca + "\nMatricula: " + matricula + "\nModelo: " + modelo;
    }
}
