import javax.xml.bind.SchemaOutputResolver;

/**
 * Operador switch, suporte
 * char, int, bye, short, enum e String
 */

public class ControleFluxo3 {
    public static void main(String[] args) {
        byte dia = 12;

        switch(dia){
            default:
                System.out.println("Opção Invalida!");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
    }
}
