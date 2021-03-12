package POO1.ClasesObjetosYMetodos;

public class test {
    public static void main(String[] args) {


    // Objeto creacion: <Clase> <nombreObjeto> <=> <new> <Clase()> <;>
        Operaciones operaciones1 = new Operaciones(); // Asi se crea un objeto. Este es con constructor vacio.

        operaciones1.sumar(20,40);// Metodo con argumentos, no es necesario pedir numeros o ejecutar metodo de resultado, ya lo incluye.


        // Metodo constructor con argumentos:

        Operaciones operaciones2 = new Operaciones(2,6); // Se pasan los parametros con los cuales se creo el constructor.
        // No es necesario pedir numeros, ya que aqui ya se ingresaron


        // Pedir numeros

        operaciones1.leerNumeros();

        // Operaciones

        // Se mandan a llamar los metodos.
        operaciones1.sumar();
        operaciones1.restar();
        operaciones1.Multiplicacion();
        operaciones1.division();

        // Resultados
        operaciones1.mostrarResultados(); // Unico metodo que arroja resultados hasta aqui.

    }
}
