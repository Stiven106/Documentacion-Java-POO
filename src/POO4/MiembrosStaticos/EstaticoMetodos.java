package POO4.MiembrosStaticos;

public class EstaticoMetodos {

    private static String frase = "Primera frase";

    public static int sumar(int n1, int n2) {
        int suma = n1+n2;
        return suma;
    }

    public static void main(String[] args) {
        /*
        Cuando un metodo es estatico, no hace falta instanciarlo, por que pertenece a la clase, y no al objeto, por lo tanto se puede mandar a
        llamar con la clase, como veremos en la siguiente linea de codigo.
         */
        System.out.println("La suma es : " + EstaticoMetodos.sumar(5,4)); //
    }



}
