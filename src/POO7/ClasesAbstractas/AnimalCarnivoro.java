package POO7.ClasesAbstractas;

public class AnimalCarnivoro extends Animal {

    public void alimentarse() {

        /*
        Encontramos la clase mas especifica y por tanto no abstracta de la clase padre "Animal", de manera que aqui aplicamos sobre escritura de miembros.

        Como hicimos en la clase "Planta" implementaremos el metodo, es decir, abrir llaves "{}" en ves de definir ";"

        Estaremos utilizando el mismo metodo de la clase padre "SerVivo", con la diferencia de que aplicaremos sobre escritura de miembros, al implementar
        el metodo y terminar la secuencia de clases abstractas, esto encontrando la clase especifica.
         */
        System.out.println("Animal carnivoro se alimenta de carne");
    }

}
