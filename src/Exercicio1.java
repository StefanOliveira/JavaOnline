/**
 * Crie um algoritmo que possua variaveis para salvar os seguintes dados: Nome, Endereço e Telefone de uma Pessoa
 * Imprima essas variaveis da seguinte forma:
 * O <nome> domiciliado no endereço <endereco> e telefone <telefone> não possui nenhum tipo de pendencia.
 */

public class Exercicio1 {
    public static void main(String[] args){
        String sNome = "Pedro Silva";
        String sEndereco = "Av. das Lamentações, 256, Jd. Java, Java - SP ";
        String sNumTel = "+55(11)3354-6789";

        System.out.println("O Sr."+ sNome +"\nDomicialiado no endereço: "+ sEndereco +"\nTelefone: "+ sNumTel +"\nNão possui nenhum tipo de pendencia.");
    }
}
