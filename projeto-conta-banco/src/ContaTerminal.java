import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome: ");
        String nome = sc.next();

        System.out.println("Por favor, digite o numero da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o numero da Agência: ");
        String agencia = sc.next();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
