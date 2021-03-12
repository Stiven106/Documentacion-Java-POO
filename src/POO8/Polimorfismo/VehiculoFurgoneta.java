package POO8.Polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
    private int carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public String mostrarDatos() {
        return "Marca: " + marca + "\nMatricula: " + matricula + "\nModelo: " + modelo
                + "\nCarga: " + carga;
    }
}
