package org.taller.Clases;

public class Prueba {

        public static void main(String[] args) {

            Coche coche1 = new Coche("Toyota", "Corolla", 180);

            // Acceso incorrecto
            System.out.println(coche1.marca);
            coche1.velocidadMaxima = 200;
        }
    }

/*
 * Este error ocurre porque los atributos de la clase Coche están declarados como private,
 * lo que significa que solo pueden ser accedidos dentro de la misma clase.
 *
 * Al intentar acceder directamente desde otra clase (por ejemplo: coche1.marca),
 * el compilador genera un error, ya que se está violando el encapsulamiento
 * definido en la clase (en este caso, private).
 *
 * El encapsulamiento es uno de los conceptos fundamentales de la POO,
 * y consiste en proteger los datos de una clase y permitir su acceso únicamente
 * a través de métodos públicos (getters y setters).
 *
 * De esta manera se evita la modificación indebida de los atributos y se mantiene
 * el control sobre cómo se manipulan los datos del objeto.
 */


// Acceso correcto

// * public static void main(String[] args) {

//System.out.println();
//Coche coche = new Coche("Honda", "Civic", 180);
//System.out.println();
//System.out.println(coche);
//System.out.println();
//coche.acelerar(20);   // válido
//System.out.println();
//System.out.println();
//System.out.println("Marca (getter): "+coche.getMarca());
