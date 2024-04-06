import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("digite o ano de lancamenot");
        int anoLancamento = leitura.nextInt();
        System.out.println("qual a avaliacao");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme + " " + anoLancamento + " " + avaliacao);
    }
}
