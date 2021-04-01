package ServletsManejoSesiones;

public class TeoriaSesiones {
    /*

                SESION HTTP

    Nos permite administrar las sesiones de los clientes. Se obtiene a partir del objeto HttpServletRequest.

                MANEJO DE SESIONES CON SERVLETS

    request.getSession(): Se utiliza para obtener la sesion que se creo a partir de la peticion del cliente.

    sesion.getAttribute(): Permite obtener un atributo previamente agregado a la sesion del cliente.

    sesion.setAttribute(): permite agregar un atributo a la sesion actual del cliente.

    sesion.removeAttribute(): Permite eliminar un atributo agregado a la sesion

    sesion.invalidate(): Invalida la sesion actual del cliente.

                MANEJO DE SESIONES CON SERVLETS

            OTROS METODOS IMPORTANTES

    sesion.isNew(): Permite saber si la sesion ha sido recien creada.

    sesion.getCreationTime(): Permite conocer la fecha y hora de cuando se creo la sesion

    sesion.getLastAccesedTime(): Permite conocer la ultima vez en que la sesion fue accedida por el cliente.

    sesion.getMaxInactiveInterval(): Permite conocer el tiempo de inactividad (en segundos) necesario para que la sesion se destruya si
    no recibe una peticion.

    sesion.setMaxInactiveInterval(): Permite modificar el valor mencionado en la funcion anterior. Este valor tambien se puede modificar en el
    archivo web.xml.

     */

}
