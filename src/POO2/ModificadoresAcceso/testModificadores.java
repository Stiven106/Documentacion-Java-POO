package POO2.ModificadoresAcceso;

public class testModificadores {

    public static void main(String[] args) {

        // Orden desde mas restringido a menos restringido.

        ModificadoresAcceso  publico = new ModificadoresAcceso();
        ModificadoresAcceso _default = new ModificadoresAcceso();
        ModificadoresAcceso privado = new ModificadoresAcceso();
        ModificadoresAcceso protegido = new ModificadoresAcceso();
        // Objetos ya creados, veamos a cuales puedo acceder:

        publico.varPublica = 1;
        _default.varDefault = 2;
        // privado.varPrivada = 3; // Si descomentas veras que esto no es posible, las variables privadas no pueden ser accedidas, si no son por metodos.
        privado.setVarPrivada(3); // Metodo set y forma correcta de acceder a una variable privada desde otra clase.
        System.out.println(privado.getVarPrivada());; // Metodo get. Mostrar de forma correcta una variable privada desde otra clase.
        protegido.varProtegida = 4;


    }
}
