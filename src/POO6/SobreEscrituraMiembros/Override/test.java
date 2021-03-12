package POO6.SobreEscrituraMiembros.Override;

public class test extends Animal{
    public static void main(String[] args) {
        Persona persona = new Persona();
        Perro perro = new Perro();
        Animal animal = new Animal();

        /*
        La sobre escritura de miembros, permite que un metodo pueda entregar un resultado distinto de un mismo metodo.
        Cuanto las clases hijas extienden de una clase padre que posee un metodo, cuyo metodo se le cambia el contenido,
        entonces sucede la sobre escritura de miembros, la cual dependiendo de la clase donde se mande a llamar al
        metodo, dara un resultado distinto. Observemos un ejemplo.
         */

        persona.comer();
        perro.comer();
        animal.comer();
    }
}
