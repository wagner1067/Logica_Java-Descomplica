package Operadores;

public class SwitchCase {
    public static void main (String[] args){

        int numero = 3 ;

        switch (numero){
            case 1 :
                System.out.println("Você digitou 1");
                break;
            case 2 :
                System.out.println("Você digitou 2");
                break;
            case 3 :
                System.out.println("Você digitou 3");
                break;
            default:
                System.out.println("Você digitou um valor invalido ");
        }

    }
}
