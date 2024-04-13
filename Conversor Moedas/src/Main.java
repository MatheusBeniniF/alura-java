import br.com.alura.conversorMoeda.modelo.Moeda;
import br.com.alura.conversorMoeda.modelo.MoedaGenerate;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        List<Moeda> moedas= new ArrayList<>();
//        System.out.println("Digite sua moeda a ser convertida: ");
//        String moedaConvertida = leitura.next();
//        System.out.println("Digite o valor que sera convertido: ");
//        Double valor = leitura.nextDouble();
        String moedaEscolhida = "";
        while(!moedaEscolhida.equalsIgnoreCase("sair")) {
            System.out.println("Digite a moeda desejada ou `sair` para sair: ");
            moedaEscolhida = leitura.next();
            if (moedaEscolhida.equalsIgnoreCase("sair")){
                break;
            }
            String uri = "https://v6.exchangerate-api.com/v6/e4dae1a680daa6405a1f2f2b/latest/" + moedaEscolhida;
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(uri))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(response.body());
                MoedaGenerate moedaGenerate = gson.fromJson(response.body(), MoedaGenerate.class);
                Moeda moeda = new Moeda(moedaGenerate.nome(), moedaGenerate.valor());
                moedas.add(moeda);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            FileWriter moedasFinal = new FileWriter("Moedas.json");
            moedasFinal.write(gson.toJson(moedas));
            moedasFinal.close();
        }
    }
}