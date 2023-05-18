package br.com.fiap.banco;

public class ValorNegativoException extends Exception {
    public ValorNegativoException() {
        super("Não é permitido utilizar valores negativos.");
    }
}