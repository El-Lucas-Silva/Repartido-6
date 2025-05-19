package Ejercicio7;

public class Cuenta {

    private int numero;
    private String titular;
    private double saldo; //_El usuario no podra ingresar un saldo inicial_

    //Constructor
    public Cuenta(int numero, String titular){
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }
    //Getters y Setters
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void depositar(double monto) {
        if (monto > 0) {
            setSaldo(getSaldo() + monto);
            System.out.println("Se deposito el dinero correctamente");
        } else {
            System.out.println("El monto debe ser mayor que cero.");
        }
    }
    public void retirar(double monto) {
        if (monto > getSaldo()) {
            System.out.println("El monto debe ser menor al saldo.");
        } else {
            setSaldo(getSaldo() - monto);
            System.out.println("Se retiro el dinero correctamente");
        }
    }
}