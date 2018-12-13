public class ControleFluxo {
    public static void main(String[] args) {
        // idade < 15 Categoria Infantil
        // idade >= 15 && idade < 18 Juvenil
        // idade >= 18 Adulto
        int idade = 18;
        String categoria;

        if(idade < 12){
            categoria = "Categoria Infantil";
        }else if(idade >= 12 && idade < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulta";
        }

        System.out.println(categoria);

    }
}
