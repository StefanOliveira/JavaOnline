import org.omg.CORBA.portable.ValueOutputStream;

/**
 * Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
 * Porém as parcelas precisam ser maiores do que 1000
 */


public class ControleFluxo6 {
    public static void main(String[] args) {

        double valorTotal = 30000;

        for(int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela <= 1000) {
               continue;
            }
            System.out.println("Parcelamento em " + parcela + " vezes, valor da Parcela é: R$" + valorParcela);
        }
    }
}
