package JavaBeans.domain;

import java.io.Serializable;
/*
Estructura: public class Persona +++++ implements +++++ Serializable {}

                Que es una interface Serializable?

    Nos permite enviar nuestra clase entre diferentes equipos. Por ejemplo si tenemos diferentes servidores de java, y necesitamos transferir este
    javaBeans entre diferentes equipos, entonces sera importante que implemente la clase serializable. Con esto se considerara un JavaBeans.

    Si la clase se considera JavaBeans, entonces otras tecnologias o frameworks podran hacer uso de nuestras clases. Si no sigue las nomenclaturas
    de un JavaBeans, dichas tecnologias no podran utilizar nuestras clases.

                Reglas Java Beans

    Caracteristicas obligatorias para que una interface se considere un JavaBeans

    1. Atributos: Deben ser privados.
    2. Debe tener un Constructor vacio. Y debe ser public.
    3. Debe tener get y set. Los get y set obviamente deberan de ser publicos, ya que con ellos podremos utilizar el JavaBeans

                Concepto de Serializacion

    Si un objeto es necesario transferirlo en la red de un servidor a otro servidor, entonces se tiene que aplicar el concepto de serializacion.
    Este concepto basicamente se significa que estamos convirtiendo nuestro objeto a bits = 010101, y cuando se recibe este objeto del otro lado
    del servidor, entonces se aplica el concepto de deserializacion, se convierte nuevamente a su estado original.


 */

public class Persona implements Serializable {

    private String nombre;
    private String apellido;

    public Persona() {

    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
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

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
