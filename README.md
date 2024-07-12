# Convertidor de Monedas - Aplicación de Consola en Java

## Descripción

Este repositorio contiene una aplicación de consola en Java que funciona como un convertidor de monedas. La aplicación permite a los usuarios convertir cantidades entre diferentes monedas utilizando tasas de cambio actualizadas.

## Características

- Convierte entre múltiples monedas.
- Utiliza tasas de cambio en tiempo real.
- Interfaz de usuario simple e intuitiva basada en consola.
- Soporta una amplia gama de monedas.
- Historial de conversiones.

## Requisitos

- Java Development Kit (JDK) 8 o superior.
- Conexión a Internet para obtener tasas de cambio en tiempo real.

## Instalación

1. Clona el repositorio:
    ```sh
    git clone https://github.com/AntonioPeralesDev/Conversor-de-monedas.git
    ```
2. Navega al directorio del proyecto:
    ```sh
    cd Conversor-de-monedas
    ```
3. Compila el proyecto:
    ```sh
    javac -d out -cp "lib/gson-2.10.1.jar" src/com/antonioperalesdev/currencyconverter/controller/*.java src/com/antonioperalesdev/currencyconverter/models/*.java src/com/antonioperalesdev/currencyconverter/principal/*.java
    ```
4. Ejecuta la aplicación:
    ```sh
    java -cp "out;lib/gson-2.10.1.jar" com.antonioperalesdev.currencyconverter.principal.principal
    ```

## Uso

1. Sigue las indicaciones en la consola para seleccionar la moneda de origen y la moneda de destino.
2. Ingresa la cantidad que deseas convertir.
3. La aplicación mostrará la cantidad convertida según las últimas tasas de cambio.
4. Puedes consultar el historial de conversiones realizadas durante la sesión.

## Contribuir

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b rama-nueva`).
3. Realiza tus cambios y haz un commit (`git commit -m 'Añadir nueva característica'`).
4. Empuja los cambios a la rama (`git push origin rama-nueva`).
5. Abre un pull request.
