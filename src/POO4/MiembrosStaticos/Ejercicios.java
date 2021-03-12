package POO4.MiembrosStaticos;

public class Ejercicios {


    private static String frase = "primera frase"; // Variable de la clase



    public static void main(String[] args) {

        Ejercicios.frase = "Cambiando el valor"; // Acceso a la variable sin instanciarla.
        System.out.println("frase = " + frase);



    }


}
