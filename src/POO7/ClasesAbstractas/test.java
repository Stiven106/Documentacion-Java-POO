package POO7.ClasesAbstractas;

public class test {

    public static void main(String[] args) {

        //
        /* SerVivo ob1 = new SerVivo(); =>> Recuerda que no se puede instanciar un objeto de una clase abstracta, esto da error. */

        Planta planta = new Planta();
        AnimalCarnivoro animalC = new AnimalCarnivoro();

        planta.alimentarse();//Se aplica sobre escritura de miembros
        animalC.alimentarse();//Se aplica sobre escritura de miembros
    }


}
