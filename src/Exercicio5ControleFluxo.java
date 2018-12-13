/**
 * Imprima todos os numeros pares de 0 até 100000
 */

public class Exercicio5ControleFluxo {
    public static void main(String[] args) {
        int nNumerosPares = 0;

        // Utilizando while
        while (nNumerosPares < 100000) {
            nNumerosPares += 2;
            System.out.println(nNumerosPares);
        }

        nNumerosPares = 100000;
        // Utilizando for
        for (int i = 0; i <= nNumerosPares; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
