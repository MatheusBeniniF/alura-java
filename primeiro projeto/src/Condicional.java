public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2019;
        boolean incluidoNoPlano = true;
        double notaDoFile =  8.1;
        String tipoPlano = "plus";

        if(anoLancamento >= 2022){
            System.out.println("lancamento q os clientes estao curtindo");
        } else {
            System.out.println("filme retro q vale a pena assistir");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("liberado");
        } else {
            System.out.println("deve pagar");
        }

    }
}
