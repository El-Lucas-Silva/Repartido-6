//Clase cuenta con metodos para ingresar y retirar saldo
//(TERMINADO)

package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta (17,"Pablo");
        c1.depositar(90);
        c1.retirar(50);
        c1.retirar(100);
    }
}
