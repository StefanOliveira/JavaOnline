package br.com.abc.intro.operadores;

public class OperadoresLógicos {
    public static void main(String[] args){
       int idade = 18;
       float salario = 1000f;

       System.out.println(idade >= 20 || salario >= 2000); //Operador OR
       System.out.println(idade >= 20 && salario >= 2000); //Operador AND
    }
}

