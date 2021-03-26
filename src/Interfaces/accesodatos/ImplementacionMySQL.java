package Interfaces.accesodatos;
/*
            COMO IMPLEMENTAR UNA INTERFACE EN JAVA

    1. Definir la clase:
    Cuando vayamos a implementar una interface tenemos que utilizar la palabra implements.
    Luego el nombre de la interface que queremos implementar, en este caso es IAccesoDatos.

    Si no implementamos los metodos en esta clase, entonces nos obliga a definilar como abstract. De esa
    forma ya no nos daria error. Pero tendriamos que agregar una clase hija para poder utilizar esta clase
    de implementacionMySQL. Debido a que si queremos utilizar esta clase, no puede ser abstracta,
    ya que de lo contrario, recordemos: no podriamos crear objetos de una clase abstracta.

    Ahora bien, para implementar la clase empieza por ayudarte por el IDE, para que te ponga todos los metodos
    para ello simplemente parate sobre ImplementacionMySQL (nombre de esta clase) y dale al boton Implements Methods, si estas en
    intellij. De esta forma te quitara el error de la clase no abstracta.

    Metodos que nos imprimira el IDE: insertar, listar, actualizar y eliminar. Estos son los metodos de la clase que implementa. Estaran vacios.
    Recordemos que no lo estara sobre escribiendo, si no que estara implementando por primera ves.

    Nota: En esta clase simularemos una conexion con Mysql
 */

public class ImplementacionMySQL implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Mysql");
    }
}
