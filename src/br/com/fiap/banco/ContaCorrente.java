package br.com.fiap.banco;

public class ContaCorrente extends Conta {
    private double tarifa;

    public ContaCorrente(String numero) {
        super(numero);
    }

    public double getTarifa() {
        return tarifa;
    }

    @Override
    public void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {
        if (valor < 0) {
            throw new ValorNegativoException();
        }
        if (valor > getSaldo()) {
            throw new SaldoInsuficienteException();
        }
        super.sacar(valor);
    }
}