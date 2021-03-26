package PalabraInstanceOf.test;

import PalabraInstanceOf.domain.Empleado;
import PalabraInstanceOf.domain.Gerente;

public class TestInstanceOF {

    public static void main(String[] args) {

        Empleado persona1 = new Empleado("Stiven",5000);
        determinarTipo(persona1); // Es de tipo empleado
        persona1 = new Gerente("Stiven G.",10000,"Contabilidad");
        determinarTipo(persona1); // Ahora es de tipo Gerente.
    }

    public static void determinarTipo (Empleado persona1) {
        /*
        instanceof: Nos permite averiguar el tipo (Clase) de un objeto.
        Observa como este metodo tiene la variable, persona1, luego instanceof para averiguar si es de tipo
        gerente.
         */

        if (persona1 instanceof Gerente) {
            System.out.println("Es de tipo gerente");
            //Si es de tipo gerente se imprime este sout.

            Gerente gerente = (Gerente)persona1; // Estamos convirtiendo la variable persona1 a tipo gerente. Y le estamos guardando en la variable gerente.

            System.out.println("Gerente getDepartamento = " + gerente.getDepartamento());
            
            

        } else if (persona1 instanceof Empleado){
            System.out.println("Es de tipo empleado");

            //error ejecucion : Gerente gerente = (Gerente)persona1;

            // error ejecucion: System.out.println("Gerente getDepartamento = " + gerente.getDepartamento());
            /*
            Aqui no da error, puesto que no existe error de compilacion, de manera que el IDE no lo detecta.
             Pero si lo hay en tiempo de ejecucion, esto se debe a que no hay nada en getDepartamento, puesto que esta variable
             apunta a una clase de tipo Padre, la cual no tiene departamento.

            Lo que si podemos hacer es apuntar a los getts and setts de la clase padre como veremos a continuacion:
             */

            System.out.println("Empleado gets = " + persona1.getClass());
        }
        else if (persona1 instanceof Object ) {
            // No tendriamos accedo en este acceso a ninguna de sus clases hijas. Por tanto no podriamos utilizar sus gets and sets
            System.out.println("Es de tipo Object");

            persona1.toString();
        }
    }

}


