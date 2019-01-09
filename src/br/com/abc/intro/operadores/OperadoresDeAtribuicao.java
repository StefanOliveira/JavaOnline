package br.com.abc.intro.operadores;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        int salario = 1800;
        int numero = 11;

        salario += 1000;
        System.out.println(salario);

        salario -= 1000;
        System.out.println(salario);

        salario /= 1000;
        System.out.println(salario);

        salario %= numero;
        System.out.println(salario);
    }
}
