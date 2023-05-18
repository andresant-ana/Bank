package br.com.fiap.banco;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        super("Saldo insuficiente na conta.");
    }
}