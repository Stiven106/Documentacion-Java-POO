package ServletsManejoSesiones;

public class TeoriaSesiones {

    /*

                MANEJO DE SESIONES CON SERVLETS

    *Una sesion en una aplicacion Web permite administrar varias peticiones de un mismo usuario.

    *La necesidad surge debido a que el protocolo HTTP es un protocolo sin estado, esto significa que entre peticion  y peticion no guarda
    ninguna informacion del usuario que realizo dicha peticion.

    *Las sesiones en los Servlets se pueden manejar por medio de dos mecanismos:
        *Cookies
        *URL Rewritting

    *El API de los Servlets abstrae estos conceptos en una clase llamada HTTPSession.

                CONCEPTO Y USO DE COOKIES

        *Una cookie es un archivo que contiene informacion en forma de nombre y valor, el cual se almacena en el navegador Web.

        *El objetivo de una Cookie es almacenar informacion del usuario cada vez que accede a un mismo sitio, como puede ser el lenguaje
        preferido, colores preferidos y en general las preferencias de usuario.

        *Las cookies no se deben utilizar para almacenar informacion sensible como passwords, tarjetas de credito, etc, debido a que la
        informacion almacenada es texto plano sin ningun tipo de encriptacion.


                API DE LAS COOKIES EN LOS SERVLETS

        *Un Cookie se puede leer en una peticion HTTP (se itera el arreglo de Cookies) y se puede escribir en una respuesta HTTP.

        *Creacion de un objeto Cookie:
            Cookie c = new Cookie("usuario","Juan");
            c.getName();
            c.getValue();

        *Metodos para leer todas las cookies en una peticion HTTP:
            Cookie[] cookies = request.getCookies();

        *Metodo para agregar una Cookie en la respuesta:
            response.addCookie(c);

                API DEL OBJETO COOKIE

        *A continuacion se mencionan los metodos mas comunes en un objeto Cookie:

            *getDomain/setDomain: Se utiliza para especificar el dominio de donde proviene o se va a almacenar la Cookie
            *getMaxAge/setMaxAge: Especifica el tiempo a expirar (segundos)
            *getName: Obtiene el nombre de la cookie, para colocar el nombre se debe usar el constructor de la clase
            *getValue/setValue: Especifica el valor asociado con el nombre de la Cookie


     */


}
