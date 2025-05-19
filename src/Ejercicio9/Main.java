package Ejercicio9;

public class Main {
    public static void main(String[] args) {

        Producto computadora = new Producto("Computadoras", 22000,23);
        Producto licuadora = new Producto("Licuadoras", 4600, 30);

        licuadora.vender(40);
        System.out.println(licuadora.getStock());
        licuadora.vender(30);
        System.out.println(licuadora.getStock());

        System.out.println();

        System.out.println(computadora.getStock());
        computadora.reponer(7);
        System.out.println(computadora.getStock());
    }
}
