package Ejercicio6;

public class Libro {
    private String titulo;

    private String autor;

    private int anio;

    //Constructor
    public Libro (String titulo, String autor, int anio){
        this.titulo = titulo;
        this.autor = autor;
        if (anio < 2025){System.out.println("El año no puede ser menor que el actual [2025]");}
        else{
            System.out.println("Libro ingresado correctamente!");
            this.anio = anio;
        }
    }

    //__________Getters y Setters__________
    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public int getAnio(){
        return this.anio;
    }

    public void setTitulo (String titulo){
        this.titulo = titulo;
    }

    public void setAutor (String autor){
        this.autor = autor;
    }

    public void setAnio (int anio){
        this.anio = anio;
    }
}
