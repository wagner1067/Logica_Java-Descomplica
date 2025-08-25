package Strings;

public class StringBuffer1 {
    public static void main(String[] args){
        String nome = "Wagner";
        String sobreNome= "Oliveira";
        String nomeCompleto = nome + sobreNome;
        String nomeComBuffer;


        StringBuffer buffer = new StringBuffer();

        buffer.append(nome);
        buffer.append(sobreNome);

        nomeComBuffer = buffer.toString();

        System.out.println(nomeCompleto);
        System.out.println(nomeComBuffer);
    }
}
