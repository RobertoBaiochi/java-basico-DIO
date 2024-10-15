public class App {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();

        conta.inserirONumeroDaConta();
        conta.inserirOCodigoDaAgencia();
        conta.inserirORegistraONomeDoCliente();
        conta.inserirSaldo();
        conta.escreverDados();
    }
}
