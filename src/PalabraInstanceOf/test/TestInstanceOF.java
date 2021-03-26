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

        } else if (persona1 instanceof Empleado){
            System.out.println("Es de tipo empleado");
        }
    }

}


