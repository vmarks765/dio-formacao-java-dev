import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Identifique-se! Digite seu nome:  ");
        String nome = sc.nextLine();
        System.out.printf("Seja bem-vindo %s, digite o número de sua Agência:  ", nome);
        String agencia = sc.nextLine();
        System.out.print("Agora, digite o número de sua Conta:  ");
        int conta = sc.nextInt();
        System.out.print("Por fim, digite o seu saldo:  ");
        double saldo = sc.nextDouble();

        String mensagem = String.format("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %d e seu saldo de R$ %.2f já está disponível para saque.\n", nome, agencia, conta, saldo);

        System.out.println(mensagem);
    }
}