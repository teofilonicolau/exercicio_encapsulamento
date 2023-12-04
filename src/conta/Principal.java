package conta;

public class Principal {

    public static void main(String args[]) {
        Conta contaDaMaria = new Conta("Maria", "123", 100.0);
        Conta contaDoJose = new Conta("José", "456", 30.0);

        // Sacando dinheiro da conta da Maria
        contaDaMaria.sacar(20.0);

        // Transferindo dinheiro da conta da Maria para a do José
        contaDaMaria.transferir(35.0, contaDoJose);

        // Fazendo pagamento através da conta da Maria
        contaDaMaria.pagar(55.0);

        // Imprimindo o saldo da Maria e do José
        System.out.println("Saldo da Maria: " + contaDaMaria.getSaldo());
        System.out.println("Saldo do José: " + contaDoJose.getSaldo());
    }
}
