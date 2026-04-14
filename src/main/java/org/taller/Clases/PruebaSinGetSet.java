package org.taller.Clases;

public class PruebaSinGetSet {
    public static void main(String[] args) {

        EstsinEnc est = new EstsinEnc("Ana", 20);

        // No se puede ni acceder ni modificar
        // est.nombre = "Pedro";   → Error
        // System.out.println(est.nombre); → Error
    }
}

/*
 * Los getters y setters son métodos que permiten acceder y modificar
 * los atributos privados de una clase de forma controlada.
 *
 * Los getters se usan para obtener el valor de un atributo,
 * mientras que los setters permiten asignar valores con validaciones.
 *
 * Esto también forma parte del encapsulamiento, ya que protege los datos
 * y evita accesos directos no controlados.
 */