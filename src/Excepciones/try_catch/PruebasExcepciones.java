package Excepciones.try_catch;

import javax.swing.*;
import java.io.*;

/*

    Cuando aplicamos try catch lo que hacemos es capturar el error, y tratar de que nuestro programa no se frene al encontrar un error.

try = intentar
catch = capturar
finally = Es opcional se va a ejecutar siempre, sea que el try encuentre una excepcion o no.
 */

public class PruebasExcepciones {

    // Metodo 1
    public void leerArchivos() throws FileNotFoundException, IOException {

        File archivo = new File("D:\\prueba\\texto.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;

        while((linea=bf.readLine()) !=null) {

            System.out.println(linea);

        }
    }

    // Metodo 2

    public void leerArchivos2() {

        try { // En el try se debe poner todo lo que puede generar una excepcion
            leerArchivos();

        } catch (FileNotFoundException ex) {// Si el try logra encontrar una excepcion, se ejcuta el catch.
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo deseado, por favor verifique la ruta.");

            /*
            Si dejaramos el programa hasta este punto, todavia daria error, esto es por que si revisamos el primer metodo leerArchivos(), veremos que
            existen 2 posibles excepciones dentro del metodo, lo cual esta definido asi: throws FileNotFoundException, IOException {} De manera que
            tendremos que crear otro catch para el caso de que se encuente la excepcion IOException.
             */
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepcion verificada.");
        } finally {
            // Opcional: Se va a ejecutar siempre, sea que el try encuentre una excepcion o no.
        }

        System.out.println("Programa terminado");

        /*
        Observa como en caso de error (que no cuentes con el archivo en la ruta) se ejecuta el programa completo, incluyendo el print que esta por fuera
        del try catch.
         */

    }

    public static void main(String[] args) {
        PruebasExcepciones prueba = new PruebasExcepciones();

        prueba.leerArchivos2();//

        /*
        Mira como se llama el metodo que contiene el try catch, esto es debido a que ese metodo cuenta tambien con el metodo que se va a compilar,
        O sea, leerArchivos() que es a quien se le hace el try. Esto lo hacemos para no tener un try super extenso, si no simplemente llamar el metodo
        en cuestion dentro del try.
         */

    }

}
