package Collection;

import java.util.ArrayList;


public class ArrayListConta {
    public static void main (String[] args){

        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Wagner");
        listaNome.add("Gabriele");
        listaNome.add("Luzia");
        listaNome.add("Vicente");

        for(String nome: listaNome){
            System.out.println(nome);
        }//usando FOR
    }
}
