/**
 * Crie um switch que dado um valor de 1 a 7
 * Considerando 1 domingo imprima se é dia util ou final de semana
 */

public class Exercicio4ControleFluxo {
    public static void main(String[] args) {
        byte dia = 2;

        switch(dia){
            default:
                System.out.println("Opção invalida! Verifique os dados digitados!");
            case 1:
                System.out.println("Domingo" + "\nFim de Semana");
                break;
            case 2:
                System.out.println("Segunda" + "\nDia Util");
                break;
            case 3:
                System.out.println("Terça" + "\nDia Util");
                break;
            case 4:
                System.out.println("Quarta" + "\nDia Util");
                break;
            case 5:
                System.out.println("Quinta" + "\nDia Util");
                break;
            case 6:
                System.out.println("Sexta" + "\nDia Util");
                break;
            case 7:
                System.out.println("Sábado" + "\nFim de Semana");
                break;
        }
    }
}
