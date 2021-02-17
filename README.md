# *AREP - Parcial 1*
# WEBSERVICE DESPLEGADA EN HEROKU

## Integrantes:

- James Alexander Torres

## Enunciado


TALLER DE VERIFICACIÓN DE CONOCIMIENTOS TÉCNICOS
REQUERIMIENTOS
Su compañía lo ha seleccionado para construir un simple webservice desplegada en Heroku para uno de los clientes más importantes.

Así, han decidido que usted debe construir un webservice  para consultar el estado del clima en lugares específicos de la tierra.  El servicio web recibirá en un campo la descripción de una ciudad, por ejemplo “London” para Londres   y deberá mostrar la información del clima para esa ciudad. Para esto utilice el API gratuito de https://openweathermap.org/ (Puede crear una cuenta para obtener la llave para realizar consultas). Se le pide que su implementación sea eficiente en cuanto a recursos así que debe implementar un caché que permita evitar hacer consultas repetidas al API externo. La petición debe pasar por su servicio web desplegado en Heroku, es decir desde su servicio en Heroku se debe invocar el servicio web de clima. El usuario no sabrá qué servicio está usted invocando por detrás. Utilice el servicio "Current Weather Data".

Debe usar spark o sockets.

El API de su servicio debe ser el siguiente:
{url del servicio en heroku}/clima?lugar={ciudad o lugar}

El servicio debe reornar un Json exactamente igual al que retorna el servicio de openweathermap denominado "Current Weather Data". Asegurese que el tipo de retorno sea Json.

Sugerencia realice la implementación de manera incremental. Haga commits regulares.

Entregue todo en GIT HUB y el enlace a Heroku.

JSON
https://www.w3schools.com/js/js_json_syntax.asp


