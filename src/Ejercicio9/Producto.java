package Ejercicio9;

public class Producto {

    private String nombre;
    private int codigo;
    private int stock;

    //private int fecha; _EJ Crear cosos que el usuario no deba ingresar EJ_

    //Constructor
    public Producto(String nombre, int codigo, int stock){
        this.nombre = nombre;
        this.codigo = codigo;
        if (stock >= 0){this.stock = stock;}
        else{this.stock = 0;}
    }
//Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
