package ClaseObject.test;

import ClaseObject.domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan",5000);
        Empleado empleado2 = new Empleado("Juan",5000);

        /*
        Dentro de la clase Empleado, si no tenemos el metodo equals(), entonces esta clase funcionara de la siguiente manera:

        Asi tengan los mismos valores, el espacio en memoria es distinto, por tanto si tomamos los dos objetos y los ponemos en un if
        para ver si son iguales, esto nos mostrara que no son iguales, su referencia en memoria es distinta.

        Si queremos averiguar en ves de por la referencia en memoria, por el contenido del objeto, tendremos que implementar equals, como veremos
        en el segundo if
         */

        if(empleado1 == empleado2) {
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memoria");
        }

        // Con equals y HashCode (Ver clase Empleado, ahi se implementan los metodos.)
        if(empleado1.equals(empleado2)) {
            System.out.println("Los objetos son iguales en contenido");
        } else {
            System.out.println("Los objetos son distintos en contenido");
        }

                                // hashCode() Observar implementacion en clase empleado.
        /*
        Este metodo regresa un valor de tipo entero, y lo calcula a partir de los valores de los atributos de nuestra clase.
        La regla es: Si el metodo equals regresa verdadero para 2 objetos, entonces el metodo hashCode debe ser igual para ambos objetos, ya
        que el calculo se realiza a partir de los mismos atributos.

        Si agregamos equals(), tambien agregaremos hashCode()

        Nota: No es lo mismo una j miniscula a una J mayuscula, esto tanto equals como hasCode daria distinto.
         */

        if(empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("El valor hashcode es igual");
        } else {
            System.out.println("El valor hascode es ditinto");
        }



    }
}
