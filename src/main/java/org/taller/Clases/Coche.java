package org.taller.Clases;

class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getVelocidadMaxima() { return velocidadMaxima; }

    // Método acelerar: solo acepta incrementos positivos
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
            System.out.println(marca + " " + modelo + " aceleró. Nueva velocidad máx: " + velocidadMaxima);
        } else {
            System.out.println("Error: el incremento debe ser positivo.");
        }
    }

    @Override
    public String toString() {
        return "Coche: " + "marca='" + marca + "', modelo='" + modelo + "', velMax=" + velocidadMaxima;
    }

}

