package br.com.fiap.banco;

public class TitularidadeDiferenteException extends Exception {
    public TitularidadeDiferenteException() {
        super("Transferência não permitida para contas com titularidades diferentes.");
    }
}