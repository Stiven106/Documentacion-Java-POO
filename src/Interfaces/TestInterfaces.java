package Interfaces;

import Interfaces.accesodatos.IAccesoDatos;
import Interfaces.accesodatos.ImplementacionMySQL;
import Interfaces.accesodatos.ImplementacionOracle;

public class TestInterfaces {
    public static void main(String[] args) {

        //IAccesoDatos datos = new IAccesoDatos(); // No podemos crear objetos de una interface.

        /*
        Para empezar a trabajar con los metodos definidos dentro de la clase, tendremos que tomar una
        implementacion, por ello fue que hicimos 2 implementaciones, para que quede claro el uso de interfaces.
        Es como si trabajaramos con una clase Padre y dos clases Hijas que comparten comportamientos en comun.

        Lo que si podemos hacer es crear un objeto de la implementacion, veamos como hacerlo:
         */

        IAccesoDatos datos = new ImplementacionMySQL(); // Forma correcta. Apuntamos al objeto que implementa la interface.
        //datos.listar();
        imprimir(datos);


        /*
        Aclaracion line 18: Aplicaremos el polimorfismo, dado que aunque tenemos tres metodos en comun = datos.listar() que esta
        en IAccesoDatos y las dos clases de implementacion, recordemos que el metodo que se ejecuta en relacion al polimorfismo, siempre sera
        el del objeto al que esta apuntando la interface, en este caso es ImplementacionMySQL, ya que este tiene prioridad.
         */

        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);

    }

    public static void imprimir (IAccesoDatos datos) {
        /*
        Nota: Fijate en el parametro del metodo. Recuerda que el parametro datos debe ser del mismo tipo de el objeto de la interface, en este caso
        IAccesoDatos.
         */

        //Metodos

        datos.insertar();
        datos.actualizar();
        datos.listar();
        datos.eliminar();
    }

}
