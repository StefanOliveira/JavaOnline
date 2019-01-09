package br.com.abc.intro.operadores;

/**
 * Operadores Básicos
 */

public class Operadores {
    public static void main(String[] args){
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero1 + numero2;
        boolean dezMaiorQueVinte = 10 >= 20;
        boolean dezMenorIgualVinte = 10 <= 20;
        // 2 formas de se imprimir os número acima
        System.out.println("O resultado da soma é: " + soma); //Resultado concatenado
        System.out.println("O resultado da soma é: " + (numero1+numero2)); //Resultado com operação matematica
        System.out.println(dezMaiorQueVinte);
        System.out.println(dezMenorIgualVinte);
        System.out.println(5==5);
        System.out.println(5 != 5);
    }
}
