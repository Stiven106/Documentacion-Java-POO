package POO7.ClasesAbstractas;

public class Planta extends SerVivo { // Lo primero es extender de la clase padre

    @Override // Cuando implementamos hay que poner un Override.
    public void alimentarse() {
        /*
        Aqui podemos ver como el metodo paso a ser especifico, debido a que no hay variaciones en la alimentacion de
        las plantas. Observa como esta clase ya no es abstracta, esto es por que hemos extendido de la clase padre
        y ahora si podemos implementar el metodo.

         */
        System.out.println("Me alimento con la fotosintesis");
    }
}
