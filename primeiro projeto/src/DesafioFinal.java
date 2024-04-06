import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        int operacaoEscolhida = 0;
        boolean escolherOperacao = false;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nomeUsuario = ler.nextLine();
        System.out.println("Digite seu saldo");
        double saldoUsuario = ler.nextDouble();
        System.out.println("Digite seu tipo de Conta");
        String tipoConta = ler.nextLine();


        System.out.println("****************");
        System.out.println("Dados iniciais do cliente");
        System.out.println("Nome: " + nomeUsuario);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldoUsuario);
        System.out.println("****************");

        System.out.println("Operacoes");

        escolherOperacao = true;
        while (escolherOperacao) {
            switch (operacaoEscolhida) {
                case 1:
                    System.out.println("Seu saldo é: " + saldoUsuario);
                    operacaoEscolhida = 0;
                    break;
                case 2:
                    System.out.println("Digite o valor a receber");
                    saldoUsuario += ler.nextDouble();
                    operacaoEscolhida = 0;
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja sacar");
                    saldoUsuario -= ler.nextDouble();
                    operacaoEscolhida = 0;
                    break;
                case 4:
                    escolherOperacao = false;
                    break;
                default:
                    System.out.println("""
                1 - Consultar Saldo
                2 - Receber Valor
                3 - Sacar
                4 - Sair
                """);
                    operacaoEscolhida = ler.nextInt();
            }
        }

    }
}
