package POO3.Constantes;

public class Principal {
    public static void main(String[] args) {
        Constantes persona1 = new Constantes("Mary Conazo", 21);





    // persona1.setNombre(); Las constantes no pueden cambiar, por lo tanto no se puede crear un metodo set. Esto no funciona.
        System.out.println(persona1.getNombre() + " Tiene : " +persona1.getEdad()); // Metodo get si funciona.
    }
}
