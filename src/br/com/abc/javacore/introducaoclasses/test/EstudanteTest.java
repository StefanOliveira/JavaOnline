package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante stefan = new Estudante();
        stefan.nome = "Stefan";
        stefan.matricula = "3062";
        stefan.idade = 32;

        System.out.println(stefan.nome);
        System.out.println(stefan.matricula);
        System.out.println(stefan.idade);
    }
}
