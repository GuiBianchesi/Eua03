import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // criar um objeto do tipo conta poupança em banco
        ContaPoupanca conta = new ContaPoupanca();
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua agencia: ");
        conta.agencia = leia.nextLine();
        System.out.println("Digite sua conta: ");
        conta.numero = leia.nextLine();
        System.out.println("Digite seu saldo: ");
        conta.saldo = leia.nextFloat();
        System.out.println("Digite a taxa: ");
        conta.taxa = leia.nextFloat();

        conta.imprimeDados();

        System.out.println("Digite o valor a ser depositado: ");
        float valor = leia.nextFloat();
        conta.depositar(valor);

        conta.imprimeDados();

        valor = conta.calcularRendimento();
        System.out.println("rendimento: "+valor);

        conta.depositar(valor);

        conta.imprimeDados();

        leia.close();
    }
}
