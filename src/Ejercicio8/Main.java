//Sueldos dependiendo del cargo
//(TERMINADO)

package Ejercicio8;

public class Main {
    public static void main (String[] args){
    Cargo e1 = new Cargo("Pepe", "Jefe", 100);
    Cargo e2 = new Cargo("Fulano", "Carpintero", 100);

    e1.getSueldoFinal();
    e2.getSueldoFinal();
    }
}
