# Proyecto Cliente Base

Proyecto base para cliente realizado en spring boot utilizando el motor de plantilla de thymeleaf.

## Tecnologias

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

Basado en la siguiente fuente: https://mkyong.com/spring-boot/spring-boot-profile-based-properties-and-yaml-example/

Lo ideal de entornos que se tendría que tener son:

- localhost_dev
- localhost_qa
- localhost_prod
- dev
- qa
- prod

Esto se debe a que en cada properties se puede tener url diferentes y más si se apuntan a otros proyectos en el mismo
ambiente.

Se tienen dos opciones: 

- Opción 1: Java System Properties (VM Arguments)
Es importante que el parámetro -D antes de su aplicación de otra manera no sera reconocido. 

    **java -jar -Dspring.profiles.active=prod application.jar**

- Opción 2: Program arguments

    **java -jar application.jar --spring.profiles.active=prod --spring.config.location=c:\config**

La segunda opción es la que utilizo en el intellij. De esta manera tengo dos configuraciones para 
hacer correr la aplicación. Una configuración para el profile de desarrollo y otra para el de producción. 

Fuente: https://stackoverflow.com/questions/31038250/setting-active-profile-and-config-location-from-command-line-in-spring-boot

## Logs

https://mkyong.com/spring-boot/spring-boot-slf4j-logging-example/