package POO8.Polimorfismo;

public class test {

    public static void main(String[] args) {
        Vehiculo misVehiculos[] = new Vehiculo[4]; // Se crea un objeto tipo array de tipo Vehiculo, se reserva memoria para 4 vehiculos (Vehiculo[4])

        misVehiculos[0] = new Vehiculo("PJL52E", "Ferrari", "98"); // Se instancia el objeto con la clase padre: Vehiculo
        misVehiculos[1] = new VehiculoTurismo(4, "PSD203", "Audi", "P14"); // Se instancia el objeto con la clase hija: VehiculoTurismo
        misVehiculos[2] = new VehiculoDeportivo("k125", "KJS234", "Toyota", 500);// Se instancia el objeto con la clase hija: VehiculoDeportivo
        misVehiculos[3] = new VehiculoFurgoneta("213sd", "Toyota", "KJS234", 2000);// Se instancia el objeto con la clase hija: VehiculoFurgoneta

        for(Vehiculo vehiculo: misVehiculos) {
            System.out.println(vehiculo.mostrarDatos());
            System.out.println();
        }


    // Observa que solamente se instancio el arreglo en la clase Vehiculo (line6), y luego se instancia el objeto en la posicion 0 con la misma clase.
    // Posteriormente se instancian las clases hijas, sin necesidad de crear o instanciar un arreglo para cada clase hija.
    // Cuando utilizamos una hija clase, utilizamos el metodo constructor de esa clase que extiende, por tanto el orden cambia en la medida en que este estructurado.
    // De manera que entendemos como polimorfismo, que una clase padre sea compatible con las demas clases hijas, pero nunca viceversa.

    }
}
