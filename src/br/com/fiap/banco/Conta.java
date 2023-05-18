package br.com.fiap.banco;

public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero) {
        this.numero = numero;
    }

    public void depositar(double valor) throws ValorNegativoException {
        if (valor < 0) {
            throw new ValorNegativoException();
        }
        saldo += valor;
    }

    public void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {
        if (valor < 0) {
            throw new ValorNegativoException();
        }
        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        }
        saldo -= valor;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}