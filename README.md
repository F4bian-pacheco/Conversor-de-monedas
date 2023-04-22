# Conversor de Monedas

Este es un conversor de monedas que te permite convertir entre diferentes divisas. 

## Cómo usar

1. Clona o descarga este repositorio en tu ordenador.
2. Abre el archivo `ConversorMonedas.java` en tu editor de código.
3. Crea un objeto `ConversorMonedas` con la divisa de origen y la divisa de destino que deseas utilizar.
4. Utiliza el método `convertir` para convertir una cantidad de la divisa de origen a la divisa de destino.

```java
ConversorMonedas conversor = new ConversorMonedas("USD", "EUR");
double cantidadUSD = 100.0;
double cantidadEUR = conversor.convertir(cantidadUSD);
```
Tasas de conversión disponibles
* USD-CLP: 716.23
* USD-EUR: 0.83
* USD-GBP: 0.72
* USD-JPY: 108.67
* USD-KRW: 1133.09
* CLP-USD: 0.0014
* EUR-USD: 1.21
* EUR-CLP: 8373.93
* EUR-GBP: 0.87
* EUR-JPY: 130.66
* EUR-KRW: 1369.88
* GBP-USD: 1.39
* GBP-CLP: 1268.11
* GBP-EUR: 1.15
* GBP-JPY: 149.54
* GBP-KRW: 1566.89
* JPY-USD: 0.0092
* JPY-CLP: 61.79
* JPY-EUR: 0.0076
* JPY-GBP: 0.0067
* JPY-KRW: 10.5
* KRW-USD: 0.00088
* KRW-CLP: 6.02
* KRW-EUR: 0.00073
* KRW-GBP: 0.00064
* KRW-JPY: 0.095
## Agregar nuevas tasas
Si deseas agregar nuevas tasas, puedes hacerlo editando la sección correspondiente en el archivo ConversorMonedas.java. Asegúrate de seguir la sintaxis adecuada:

```java
tasas.put("DIVISA-DESTINO", TASA);
```
Donde DIVISA-DESTINO es la divisa a la que se desea convertir, y TASA es el valor de la tasa de conversión.

## Contribución
Si encuentras algún error o deseas contribuir al proyecto, ¡no dudes en hacer un pull request!
