/**
 * for, while e do while
 */

public class ControleFluxo4 {
    public static void main(String[] args) {

        // Loop com while
        int contador = 0;
        while (contador < 10) {
            contador++;
            System.out.println(contador);
        }

        // Loop do while
        contador = 0;
        do {
            System.out.println("Dentro do do while: "+ contador++);
        } while (contador < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("Valor de i é: " + i);
        }

    }
}
