package ConversionObjetos.test;

import ConversionObjetos.domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {

        Empleado empleado;

        empleado = new Escritor("Juan", 5000,TipoEscritura.CLASICO); // Se aplica polimorfismo.

        //System.out.println(empleado);

        empleado.obtenerDetalles();// Se aplica sobre escritura de metodos.

        /*
        empleado.obtenerDetalles(): => Esto imprime el objeto al cual este apuntando en memoria, en este caso Escritor.
         Entonces el metodo que se ejecuta imprime el metodo de la clase hija = Escritor. Si le damos click al metodo nos enviara a la clase padre
         esto significa que el IDE no puede definir de donde viene el metodo. A nivel de compilacion podemos observar que el polimorfismo no lo
         podemos definir, este se definira al momento de ejecutar el programa. Recordemos que en el polimorfismo, las clases hijas son compatibles
         con la clase padre, pero no viceversa.

         Hasta aqui simplemente hemos visto varias aclaraciones de el polimorfismo...

         Ok, hasta este punto todavia no hemos visto lo que es la conversion o casting. Entonces, para ello vamos a intentar llamar un metodo
         de la clase Hija (Escritor) en este objeto de Tipo Empleado (Clase Padre de Escritor).

         empleado.getTipoEscritura(); Esto no funciona debido a que este metodo solo esta definido en la clase Hija, mas no en la clase Padre
         a diferencia de obtenerDetalles() que esta definido en ambos.
         Ahora bien, si queremos que funcione tendriamos que hacer un Casting de la siguiente forma:

                            DOWNCASTING
        Convirtiendo una referencia de tipo Padre, a una clase Hija.

            Forma corta:
                ((Escritor)empleado).getTipoEscritura();
            Forma larga:
                 Escritor escritor = (Escritor)empleado;
                escritor.getTipoEscritura();

                            UPCASTING
        En el Upcasting no hace falta convertir, ya que asignar una variable de tipo hija hacia una variable de tipo padre, el compilador no marca
        ningun problema.

            Empleado empleado2 = escritor;

         */

        ((Escritor)empleado).getTipoEscritura(); // downcasting

        Escritor escritor = (Escritor)empleado;// downcasting
        escritor.getTipoEscritura();// downcasting

        Empleado empleado2 = escritor; // Upcasting


    }

}
