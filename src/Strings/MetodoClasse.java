package Strings;

public class MetodoClasse {
    public static void main (String[] args) {
        String nome = "Wagner";
        String nomeGuerra = "Wagner";
        String sobrenome = new String("Wagner");

        if (nome == nomeGuerra)
            System.out.println("Nomes iguais");
        else System.out.println("Nome Diferentes");

        if (nome == sobrenome)
            System.out.println("Nomes iguais");
        else System.out.println("Nome Diferentes"); //Vai da diferente por causa do NEW STRING

        if (nome.equals(nomeGuerra))
            System.out.println("Nomes iguais");
        else System.out.println("Nome Diferentes");

        if (nome.equals(sobrenome))
            System.out.println("Nomes iguais");
        else System.out.println("Nome Diferentes"); // vai da iguais pois ele compara conteudo
    }
}
