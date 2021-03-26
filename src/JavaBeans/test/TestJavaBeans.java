package JavaBeans.test;

import JavaBeans.domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("Juan");
        persona.setApellido("Perez");


        // Imprimir de varias formas...

        System.out.println(persona);
        System.out.println(persona.toString());
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());

    }
}
