package JSPsElementos;

public class TeoriaElementos {
    /*
                    ELEMENTOS DE UN JSP

        Expressions:evaluadas e insertadas en la salida del servlet.

            *Sintaxis: <%= expresion %>
            *La expresion se evalua y se inserta en la salida del servlet
            *Es equivalente a out.println(expresion)

        Scriptlets: Un scriplet puede tener codigo Java que no necesariamente va a visualizar el cliente.
        Permiten incrustar código escrito en otro lenguaje de programación. Demasiado codigo en un scriplet se considera una mala practica.

            *Sintaxis: <% codigoJava %> : evalúa la expresión y muestra el resultado en la página.
            *El codigo Java se inserta en el metodo service() del Servlet generado
            *Puede ser cualquier codigo Java valido

        Declaraciones: el código es insertado en la clase del servlet, fuera de los métodos.
        El codigo que agreguemos, si es que agregamos una variable, se vuelve una variable de instancia. Debido a que se esta agregando
        como una variable del Servlet generado y no unicamente como una variable local de cierto metodo.
        Este concepto no es muy utilizado, pero se utiliza siempre y cuando necesitemos agregar variables o metodos que pertenezcan a nuestro
        Servlet generado a partir del JSP.

            *Sintaxis: <%! codigoJava %>
            *Se utiliza para agregar codigo a la clase del Servlet generado.
            *Se pueden declarar variables o metodos que pertenecen a la clase

        Sintaxis XML:

            *Cada elemento JSP tiene su equivalente en sintaxis XML
            *Esta sintaxis se utiliza para tener una mayor compatibilidad, por ejemplo, con herramientas visuales.



        Expresion: Puede ser una cadena, expresion matematica, o el resultado de una llamada a una funcion. Pero este tiene que regresar un
        valor, no puede ser null.

                    VARIABLES IMPLICITAS EN LOS JSP'S

        Los metodos siguientes estan implicitos en los JSP's, de manera que no hace falta instanciarlos. Simplemente poner el nombre de la variable
        y por medio del operador ".", podemos acceder a los atributos y metodos del objeto.

            request:
                *Es el objeto HTTPServletRequest

            response:
                *Es el objeto HttpServletResponse

            out:
                *Es el objeto JspWriter (equivalente a PrintWriter)

            session: Podemos obtener informacion que ya hemos agregado a nuestra sesion, por ejemplo, un Servlet.
                *Es el objeto HttpSession asociado con el objeto request

            application:
                *Es el objeto ServletContext que se obtiene a partir del metodo getServletContext() en un Servlet.

*/

}
