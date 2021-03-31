package ServlersCabecerosDeRespuesta;

public class ServletsCabecerosDeRespuesta {

    /*

                Cabeceros de respuesta con Servlets

        *Los cabeceros de respuesta se utilizan para indicar al navegador Web como debe comportarse ante una respuesta de parte del
        servidor Web.

        *Un ejemplo comun es generar hojas de Excel, PDF's, Audio, Video, etc, en lugar de solamente responder con texto.

        *Para indicar el tipo de respuesta se utilizan los tipos MIME (Multipurpose Internet Mail Extension).

        *Los tipos MIME son un conjunto de especificaciones con el objetivo de intercambiar archivos a traves de internet como puede ser
        texto, audio, video, entre otros tipos.

                Ejemplos mas comunes de tipos mime

            application/msword              >>>     Microsoft Word document
        Nota: Especificar del lado del servidor el tipo que enviaremos a nuestro cliente. Es decir, el tipo MIME de tipo application/msword

            application/pdf                 >>>     Acrobat (.pdf) file
            application/vnd.ms-excel        >>>     Excel spreadsheet
            application/vnd.ms-powerpoint   >>>     Powerpoint presentation
            application/zip                 >>>     Zip archive
            audio/x-wav                     >>>     Microsoft Windows sound file
            text/css                        >>>     HTML cascading style sheet
            text/xml                        >>>     HTML document
            image/gif                       >>>     GIF image
            image/jpeg                      >>>     JPEG image
            image/png                       >>>     PNG image
            video/mpeg                      >>>     MPEG video clip
            video/quicktime                 >>>     QuickTime video clip

        Estos son solo algunos ejemplos, la lista es aun mas grande.

                Metodos para establecer valores de los Headers:

        response.setHeader(String nombreCabecero, String valorCabecero), setDateHeader y setIntHeader ponen un cabecero, si ya existe lo reemplaza.

        response.addHeader, addDateHeader y addIntHeader agregan nuevos valores en lugar de reemplazarlos

                Metodos mas comunes para establecer valores de los Headers:

        setContentType(Se utiliza la tabla MIME para definir su valor)
        setContentLength
        addCookie
        sendRedirect

        Nota: Ver explicacion de estos metodos en paquete ServletsCabecerosYRequestHTTP

                CABECEROS DE RESPUESTA MAS COMUNES

        Cache-Control y Pragma: Se usan para el control del cache
        Content-Encoding: Indica la codificacion del documento
        Content-Length: Indica el numero de bytes en la respuesta
        Content-Type: Indica el tipo MIME a responder
        Expires: Indica el tiempo en que el documento se considera expirado
        Last-Modified: INdica el tiempo en que el documento fue modificado
        Refresh: Indica los segundos en que el navegador recarga la pagina
        Set-Cookie: Agrega una cookie al navegador
        WWW-Authenticate: Indica el tipo de autenticacion











     */


}
