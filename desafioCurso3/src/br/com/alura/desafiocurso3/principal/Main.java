package br.com.alura.desafiocurso3.principal;

import br.com.alura.desafiocurso3.models.CartaoDeCredito;
import br.com.alura.desafiocurso3.models.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartao: ");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limite);

        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite a descricao da compra");
            String descricao = leitura.next();
            System.out.println("Digite o valor da compra");
            double valor = leitura.nextDouble();
            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartaoDeCredito.lancaCompra(compra);
            if (compraRealizada) {
                System.out.println("Compra realizada");
                System.out.println("Digite c para continuar ou s para sair");
                String vaiContinuar = leitura.next();
                continuar = vaiContinuar.equals('c') ? true : false;
            } else {
                System.out.println("Limite insuficiente");
                continuar = false;
            }

            System.out.println("*******************");
            System.out.println("Compras realizadas: \n");
            Collections.sort(cartaoDeCredito.getCompras());
            for (Compra c: cartaoDeCredito.getCompras()) {
                System.out.println(c.getDescricao() + " - " + c.getValor());
            }

            System.out.println("*******************");
            System.out.println("Saldo cartao: " + cartaoDeCredito.getSaldo());

        }
    }
}
