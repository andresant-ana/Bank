package br.com.fiap.banco;

public class Transferencia {
    public static void realizarTransferencia(Conta origem, Conta destino, double valor)
            throws ValorNegativoException, SaldoInsuficienteException, TitularidadeDiferenteException {
        if (valor < 0) {
            throw new ValorNegativoException();
        }
        if (valor > origem.getSaldo()) {
            throw new SaldoInsuficienteException();
        }
        if (!origem.getClass().equals(destino.getClass())) {
            throw new TitularidadeDiferenteException();
        }
        origem.sacar(valor);
        destino.depositar(valor);
    }
}