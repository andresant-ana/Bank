package br.com.fiap.banco;

public class App {
    public static void main(String[] args) {

        Conta conta = new Conta("2312");
        conta.toString();

        ContaPoupanca poupanca = new ContaPoupanca("3214");
        poupanca.toString();

        ContaCorrente corrente = new ContaCorrente("1234");
        corrente.toString();

        // ↓ TESTES INVÁLIDOS ↓

        try {
            conta.depositar(-100);
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        }


        try {
            conta.sacar(500);
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }


        try {
            Transferencia.realizarTransferencia(conta, poupanca, 200);
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (TitularidadeDiferenteException e) {
            System.out.println(e.getMessage());
        }


        try {
            Transferencia.realizarTransferencia(conta, conta, -100);
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (TitularidadeDiferenteException e) {
            System.out.println(e.getMessage());
        }


        try {
            poupanca.sacar(100);
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }


        // ↓ TESTES VÁLIDOS ↓

        try {
            conta.depositar(500);
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        }

        // Exemplo de saque válido
        try {
            conta.sacar(200);
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }


        try {
            Transferencia.realizarTransferencia(corrente, conta, 100);
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (TitularidadeDiferenteException e) {
            System.out.println(e.getMessage());
        }


        try {
            Transferencia.realizarTransferencia(poupanca, conta, 50);
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (TitularidadeDiferenteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo da conta: " + conta.getSaldo());
        System.out.println("Saldo da conta corrente: " + corrente.getSaldo());
        System.out.println("Saldo da conta poupança: " + poupanca.getSaldo());
    }
}