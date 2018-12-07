/**
 * Crie um algoritmo que possua as variaveis nome, salario, sexo (M ou F), idade, estado civil.
 * Imprima da Seguinte forma:
 * O trabalhador(a)<nome> do sexo<sexo>, idade<idade>, estado civil<estadocivil> e salario<salario>, encontra-se empregado
 * neste estabelecimento.
 */

public class Exercicio2 {
    public static void main(String[] args){
        String sNome = "Maria Antonia";
        String sSexo = "Feminino";
        String sEstCiv = "Solteira";
        double fSalario = 2500.00;
        int iIdade = 38;

        System.out.println("O(A) trabalhador(a): "+sNome+"\nSexo: "+sSexo+"\nIdade: "+iIdade+",\nEstado Civil: "+sEstCiv+"\nSalario: R$"+fSalario);
    }
}
