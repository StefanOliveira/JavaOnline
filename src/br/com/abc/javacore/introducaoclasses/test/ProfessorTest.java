package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        // Dados da classe Professor
        professor.nome = "Marco";
        professor.matricula = "1010";
        professor.cpf = "101.010.101-0";
        professor.rg = "10.101.010-10";

        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.cpf);
        System.out.println(professor.rg);
    }
}
