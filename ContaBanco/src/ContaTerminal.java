import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da sua conta: ");
        numero = scan.nextInt();
        System.out.print("Agora informe a Agência: ");
        agencia = scan.next();
        System.out.print("Informe o seu nome: ");
        nomeCliente = scan.next();
        scan.nextLine();
        System.out.print("Digite o valor a ser depositado na conta: ");
        saldo = scan.nextDouble();

        scan.close();

        System.out.println();
        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, " +
                            "sua agência é " + agencia + ", conta " + numero +
                            " e seu saldo " + saldo + " já está disponível para saque!");

    }
}