package br.com.abc.intro.controlefluxo;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
 * Porém as parcelas precisam ser maiores do que 1000
 */

public class ControleFluxo5 {
    public static void main(String[] args) {

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcelamento em " + parcela + " vezes, valor da Parcela é: R$" + valorParcela);

        }
    }
}
