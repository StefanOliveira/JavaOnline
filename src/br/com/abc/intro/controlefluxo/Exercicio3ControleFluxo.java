package br.com.abc.intro.controlefluxo;

/**
 * Crie uma variavel salario e imprima seu imposto
 * imposto:
 * salario < 1000 5%
 * salario >= 1000 && salario < 2000 10%
 * salario >= 2000 && salario <= 4000 15%
 * salario > 4000 20%
 */
public class Exercicio3ControleFluxo {
    public static void main(String[] args) {
        double salario = 2800;
        double imposto;

        if(salario < 1000){
            imposto = salario * 0.05;
        }else if(salario >= 1000 && salario < 2000){
            imposto = salario * 0.10;
        }else if(salario >= 2000 && salario <= 4000){
            imposto = salario * 0.15;
        }else{
            imposto = salario * 0.20;
        }

        System.out.println("O imposto referente ao salário de: R$" + salario + " é: R$" + imposto);

    }
}
