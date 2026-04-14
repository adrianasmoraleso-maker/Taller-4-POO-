package org.taller.Clases;

import org.taller.Clases.Estudiante;

public class PruebaAccesoIncorrecto {
    public static void main(String[] args) {

        Estudiante est = new Estudiante();

        // Acceso incorrecto (esto genera un error de compilación)
        est.nombre = "Carlos";   // Error
        est.edad = 25;           // Error

        System.out.println(est.nombre); // Error
    }
}

/*
 * En este caso se intenta acceder directamente a los atributos de la clase Estudiante,
 * pero estos están declarados como private.
 *
 * El error de compilación se genera porque los atributos private solo pueden ser
 * accedidos dentro de la misma clase.
 */