package Interfaces.accesodatos;
/*
                                Interfaces

        Los métodos de una interface al no tener una implementación, son métodos abstractos, sin embargo, una interface es un nuevo tipo en java.

        -Todos los métodos que definamos en una interface serán abstractos.

        -Si agregamos atributos a una interface, ellos serán constantes,
        esto quiere decir que en automático los atributos serán public, final y static, los 3 atributos asignados a una constante.

        Diferencias entre clase abstracta y interface

        - Cuando las características son parecidas en nuestra clase,
        entonces esto quiere decir que tenemos una relacion de herencia. Por ende lo mas conveniente es utilizar una clase abstracta.

        - Cuando los comportamientos son parecidos, entonces es mas conveniente utilizar una interface.
     */

public interface IAccesoDatos {

    int MAX_REGISTRO = 10; // Es una constante en automatico => Regla de las interfaces. Una constante siempre se debe asignar un valor.

    void insertar(); // Metodo abstracto en automatico.

    void listar();

    void actualizar();

    void eliminar();





}
