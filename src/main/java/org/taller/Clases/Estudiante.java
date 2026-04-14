package org.taller.Clases;

class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Getters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getNotaPromedio() { return notaPromedio; }

    // Setters con validación
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacío.");
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Error: edad inválida (" + edad + ").");
        }
    }

    public void setNotaPromedio(double nota) {
        if (nota >= 0.0 && nota <= 5.0) {
            this.notaPromedio = nota;
        } else {
            System.out.println("Error: nota debe estar entre 0.0 y 5.0.");
        }
    }

    @Override
    public String toString() {
        return "Estudiante '" + nombre + "', edad= " + edad + ", nota= " + notaPromedio + ")";
    }

    public static void main(String[] args) {

        System.out.println();
        Estudiante est = new Estudiante();
        est.setNombre("Valentina Ríos");
        est.setEdad(21);
        est.setNotaPromedio(4.3);
        System.out.println(est);

        System.out.println();
        // Intentos con valores inválidos
        est.setEdad(-5);
        est.setNotaPromedio(6.0);
        est.setNombre("");
        System.out.println("Tras intentos inválidos: " + est);
    }
}

