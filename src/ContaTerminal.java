import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    int numeroConta = 0;
    String agencia = "000-A";
    String nomeCliente = "";
    double saldo = 0;

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void inserirONumeroDaConta () {
        System.out.println("Digite o número da sua conta:");
        numeroConta = scanner.nextInt();
        scanner.nextLine();
    }

    public void inserirOCodigoDaAgencia () {
        System.out.println("Digite o código da sua agência:");
        agencia = scanner.next();
        scanner.nextLine();
    }

    public void inserirORegistraONomeDoCliente () {
        System.out.println("Digite o seu Nome Completo:");
        nomeCliente = scanner.nextLine();
    }

    public void inserirSaldo () {
        System.out.println("Digite quando vai depositar:");
        saldo = scanner.nextDouble();
        scanner.nextLine();
    }

    public void escreverDados() {
        String mensagem = String.format( "Olá %s, obrigado por criar uma conta no nosso banco!\nSua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
        nomeCliente, agencia, numeroConta, saldo );

       System.out.println(mensagem);
        
    }

}
