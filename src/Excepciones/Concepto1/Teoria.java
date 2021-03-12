package Excepciones.Concepto1;

/*
    Excepciones: Cuando un programa java viola las restricciones semanticas del lenguaje (se produce un error), la maquina virtual Java comunica
    este hecho al programa mediante una excepcion.

    Muchas clases de errores pueden provocar una excepcion, desde un desbordamiento de memoria o un disco duro estropeado, un intento de dividir
    por cero o intentar acceder a un vector fuera de sus limites. Cuando esto ocurre, la maquina virtual Java crea un objeto de la clase exception.



 */

public class Teoria {

    public static void main(String[] args) {

        int num1=5, num2=0;

        int resultado = num1/num2;


        System.out.println("resultado = " + resultado);

        /*
            Como puedes ver, a este punto el IDE no te muestra un error, sin embargo un numero no se puede dividir entre 0.
            Si lo ejecutamos si nos mostrara el error por consola:

                Exception in thread "main" java.lang.ArithmeticException: / by zero
                at Excepciones.Concepto.Excepcion.main(Excepcion.java:20)

            Hay varios tipos de excepciones, este sola es una de ellas, para mas info leer la teoria.

            Una ves el error sale por consola, el programa deja de compilar. Por tanto el resto de codigo no se ejecuta asi este bueno.

        */

        System.out.println("Hola mundo"); // No se ejecuta



    }


}
