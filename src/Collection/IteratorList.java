package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorList {
    public static void main (String[] args){

        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Wagner");
        listaNome.add("Gabriele");
        listaNome.add("Luzia");
        listaNome.add("Vicente");

        Iterator<String> iterator = listaNome.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }//usando o While
    }
}
