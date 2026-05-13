public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("Número inválido");
        }
    }

    public void setTitular(String titular) {
        if (titular != null && titular.length() > 0) {
            this.titular = titular;
        } else {
            System.out.println("Nome inválido");
        }
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo = saldo + quantia;
            System.out.println("Depósito realizado: " + quantia);
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }

    public void sacar(double quantia) {
        if (quantia > 0) {
            if (saldo >= quantia) {
                saldo = saldo - quantia;
                System.out.println("Saque realizado: " + quantia);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("quantia inválido para saque");
        }
    }
}