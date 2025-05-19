package Ejercicio8;

public class Cargo {

    private String nombre;
    private String cargo;
    private double sueldoBase;

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Cargo (String nombre, String cargo, double sueldoBase){
        this.nombre = nombre;
        this.cargo = cargo;
        if (sueldoBase > 0){
            this.sueldoBase = sueldoBase;
        }else{
            System.out.println("El sueldo no puede ser menor a 0");
            this.sueldoBase = 1;
        }
    }
    public void getSueldoFinal(){
        if (getCargo().equals("Jefe")){
            System.out.println("Sueldo:"+getSueldoBase());
            System.out.println("Bono por jefe:"+getSueldoBase() * 0.20);
            System.out.println("Sueldo FINAL:"+getSueldoBase()+(getSueldoBase() * 0.20));
        } else {
            System.out.println("Sueldo:"+getSueldoBase());
        }
    }
}
