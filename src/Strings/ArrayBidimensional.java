package Strings;

public class ArrayBidimensional {
    public static void main(String[] args){

        int i, j;
        int [][] matriz = {{1,2,3},{4,5,6}};

        for (i=0; i<2; i++){
            for(j=0; j<3; j++) System.out.println(matriz[i] [j]);
        }
    }
}
