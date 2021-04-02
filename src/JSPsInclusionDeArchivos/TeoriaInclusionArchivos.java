package JSPsInclusionDeArchivos;

public class TeoriaInclusionArchivos {

    /*
                    INCLUSION DE ARCHIVOS EN JSP'S

        Inclusion Estatica ()translation time):
            <%@include file="paginaRelativa.jsp" %>

        Inclusion Dinamica (request time):
            <jsp:include page="paginaRelativa.jsp" />


                    INCLUSION ESTATICA

        Sintaxis:
            <%@include file="paginaRelativa.jsp" %>

        Objetivo:
            *Reutilizar codigo en texto plano, HTML o JSP's
            *En este caso el JSP que se incluye puede afectar al JSP incluyente

        Notas:
            *En este caso no se delega el control al JSP incluido, sino que se incluye el archivo JSP, generando un unico JSP
            *Por lo anterior, se pueden tener variables o metodos que se comparten entre los JSP's
            *Para tener la version mas reciente, se recomienda compilar y construir nuevamente el proyecto.


        INCLUSION DINAMICA

        Sintaxis:
            <jsp:include page="paginaRelativa.jsp" />

        Objetivo:
            *Reutilizar codigo en texto plano, HTML o JSP's
            *Permite actualizar el contenido sin alterar al JSP que incluye el contenido a reutilizar

        Notas:
            *El JSP principal, delega el control al JSP incluido y la salida del JSP se agrega al JSP principal.
            *No se comparten variables o metodos entre los JSPs, pero garantiza tener siempre la version mas reciente.
            *La pagina debe ser relativa a la aplicacion web (uso de/)
            *Se pueden incluir archivos privados (desde la carpeta WEB-INF)
     */

}
