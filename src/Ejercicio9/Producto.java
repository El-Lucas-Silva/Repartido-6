package Ejercicio9;

public class Producto {

    private String nombre;
    private int stock;
    private int precio;

    //Constructor
    public Producto(String nombre, int precio, int stock){
        this.nombre = nombre;
        if (precio >= 0){this.precio = precio;}
        else{
            System.out.println("El precio era menor que 0, así que se asigno el precio 0 en consecuencia");
            this.precio = 0;
        }
        if (stock >= 0){this.stock = stock;}
        else{
            System.out.println("El Stock era menor que 0, así que se asigno el stock 0 en consecuencia");
            this.stock = 0;
        }
    }
//Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int codigo) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void vender(int cantidad){
        if (cantidad > getStock()) {
            System.out.println("Hay menos Stock que la cantidad proporcionada.");
        } else {
            setStock(getStock() - cantidad);
            System.out.println("Se vendieron "+cantidad+" "+getNombre());
        }
    }
    public void reponer(int cantidad){
        setStock(getStock() + cantidad);
        System.out.println("Se agregaron "+cantidad+" "+getNombre());
        }
}
