package conta;

public class Conta {
    private String titular;
    private String numeroDaConta;
    private double saldo;

    public Conta(String titular, String numeroDaConta, double saldo) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        // Usando o novo método setSaldo para configurar o saldo inicial
        setSaldo(saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    // Método modificado para incluir verificação de saldo
    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Valor inválido para saldo!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        double novoSaldo = this.saldo - valor;
        setSaldo(novoSaldo);
    }

    public void transferir(double valor, Conta contaDestino) {
        double novoSaldodaContaOrigem = this.saldo - valor;
        double novoSaldoDaContaDestino = contaDestino.getSaldo() + valor;

        setSaldo(novoSaldodaContaOrigem);
        contaDestino.setSaldo(novoSaldoDaContaDestino);
    }

    public void pagar(double valor) {
        double novoSaldo = this.saldo - valor;
        setSaldo(novoSaldo);
    }
}
