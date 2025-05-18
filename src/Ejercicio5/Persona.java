package Ejercicio5;

public class Persona {
    private String nombre;

    private int edad;

    //Constructor
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

        System.out.println("Persona creada: ["+nombre+"]");
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}