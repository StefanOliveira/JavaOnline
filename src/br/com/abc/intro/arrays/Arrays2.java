package br.com.abc.intro.arrays;

/**
 * aula 19 Arrays parte 2
 */


public class Arrays2 {
    public static void main(String[] args) {
        /*
        byte, short, int, long, float, double = 0
        char = '' '\u0000'
        boolean = false
        String/reference = null
        */
        String[] nomes = new String[3];
        nomes[0] = "Sophia";
        nomes[1] = "Stefan";
        nomes[2] = "Érika";

        for(int i=0; i < nomes.length; i++){
            System.out.println((i + 1) + " Nome " + nomes[i]);
        }

    }
}
