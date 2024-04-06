public class Main {
    public static void main(String[] args) {

        System.out.println("Esse e o screen match¡");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lancamento: " + anoDeLancamento);

        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);

        String sinopse;

        sinopse = """
                Filme de aventura
                Muito bom!
                Ano de lancamento: 
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

        double temperatura = 32;
        double converteTemperatura = (temperatura*1.8) + 32;
        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperatura, converteTemperatura);
        System.out.println(mensagem);


    }
}