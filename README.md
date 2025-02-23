# Ejercicio 6: Sistema de Artículos

## Requisitos

### Clase `Articulo`
- Debe contar con las siguientes propiedades:
  - `nombre` (modificable)
  - `precio` (modificable)
  - `id` (generado automáticamente mediante un contador `totalArticulos` y una función `generarId()`, no modificable ni accesible desde fuera de la clase)

- Métodos:
  - `promocionNavidad(porcentaje: Double)`: Aplica un descuento del porcentaje indicado al precio.
  - Sobrescribir `toString()` para retornar una cadena con el formato:

### Clase `Ordenador` (hereda de `Articulo`)
- Propiedad adicional:
  - `tipo: TipoOrdenador` (puede tomar valores: `BASICO`, `OFIMATICA`, `TODOTERRENO`, `GAMING`, con `BASICO` como valor por defecto)
- Sobrescribir el método `promocionNavidad(porcentaje: Double)`, asegurando que solo aplique la promoción si el precio es superior a 500€.

## Implementación en `main`
1. Crear dos artículos con precios de 25€ y 45€.
2. Crear dos ordenadores:
   - Un `GAMING` con precio de 1299.99€.
   - Un `BASICO` con precio de 399.99€.
3. Generar una lista con todos los artículos y recorrerla aplicando la promoción de Navidad.
4. Imprimir el contenido de la lista después de aplicar la promoción.

## Preguntas y análisis
1. **¿De qué tipo genera en la lista por defecto el compilador?**
   - El compilador infiere que la lista es de tipo `List<Articulo>`, ya que `Ordenador` hereda de `Articulo`.

2. **¿Qué ocurre en este ejemplo con respecto al polimorfismo de la herencia?**
   - Se observa el polimorfismo al almacenar instancias de `Articulo` y `Ordenador` en la misma lista y al sobrescribir métodos en `Ordenador`.

3. **¿Qué pasaría si creáramos la lista con `listOf<Ordenador>`?**
   - Solo podríamos almacenar objetos de la clase `Ordenador`, excluyendo instancias de `Articulo`.

4. **¿Qué pasaría si la hiciéramos con `listOf<Any>`?**
   - La lista aceptaría cualquier tipo de objeto en Kotlin, perdiendo restricciones específicas para artículos.

