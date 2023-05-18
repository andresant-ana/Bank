package br.com.fiap.banco;

public class ContaPoupanca extends Conta {
    private double taxa;

    public ContaPoupanca(String numero) {
        super(numero);
    }

    public double getTaxa() {
        return taxa;
    }

    @Override
    public void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {
        throw new UnsupportedOperationException("Não é permitido realizar saques em conta poupança.");
    }
}