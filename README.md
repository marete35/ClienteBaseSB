# Tecnologias

Proyecto base para cliente realizado en spring boot utilizando el motor de plantilla de thymeleaf. 

- Spring 4.3
- Java 17
- Maven profiles
- Patron Modular Javascript.
- Librerias JavaScript
- aCollapTable
- bootstrap
- calendar
- chart
- datatables
- download
- fontAwesome
- jQuery
- jQueryValidate
- taffy(json)

## Fuentes

Log4j loguear en varios archivos

http://java-all-frameworks.blogspot.com/2011/08/log4j.html

https://www.arquitecturajava.com/maven-profiles-y-como-usa/

https://nopaldev.com/filtrar-properties-por-ambiente-en-maven/

https://stackoverflow.com/questions/9543219/how-to-configure-maven-to-use-different-log4j-properties-files-in-different-envi

https://mkyong.com/maven/maven-profiles-example/

## Modo de Instalar la aplicacion

mvn clean install -P dev   (con -P indicamos el perfil)

Lo ideal de entornos que se tendría que tener son:

- localhost_dev
- localhost_qa
- localhost_prod
- dev
- qa
- prod

Esto se debe a que en cada properties se puede tener url diferentes y más si se apuntan a otros proyectos en el mismo
ambiente. 
