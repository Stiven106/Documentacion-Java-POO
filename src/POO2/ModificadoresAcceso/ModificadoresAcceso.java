package POO2.ModificadoresAcceso;

// Encontraras teoria de modificadores de acceso, y metodos accesores de el modificador private.

public class ModificadoresAcceso<varPrivada> {
    /*
                        Teoria

        Orden de menos restrictivo a mas restrictivo:

        Modificadores:

        public : Aplica a clases, variables y constructores, asi que cada uno tendra un significado diferentes, segun el lugar donde se aplique

        default : Es la ausencia de cualquier modificador. Si se define sin modificador se entiende que es default.
        Si es default, es definido dentro del paquete, por lo que no podra ser accedida por otros paquetes del proyecto.

        private : No aplica a clases. Si aplica a variables, metodos y constructores

         protected :
         1. Indica que los elementos solo pueden ser accedidos desde su mismo paquete, al igual que el modificador default.
         2. Y tambien desde cualquier clase que herede la clase en que se encuentra, independientemente si esta en el mismo paquete o no.
         3. No aplica en clases. Variables, metodos y constructores si.

         Diferencias entre protected y default: Un miembro default puede ser accedido solo si la clase que accede al
         miembro pertenece al mismo paquete, mientras que un miembro protected puede ser accedido (a través de la herencia)
         por una subclase incluso si la subclase está en un paquete diferente.

     */

    // Ejemplos:

    public int varPublica; // Se puede hacer desde cualquier paquete.
    int varDefault; // Se puede acceder unicamente desde el mismo paquete.
    private int varPrivada; // Se accede mediante metodos (Set y Get) unicamente para las demas clases.
    // varPrivada = 3; // Esto en otra clase, como test no seria posible para variable privada.
    protected int varProtegida; //



    // Creacion de metodos get y set para varPrivada.
    public int getVarPrivada() {
        return varPrivada;
    }

    public void setVarPrivada(int varPrivada) {
        this.varPrivada = varPrivada;
    }
}
