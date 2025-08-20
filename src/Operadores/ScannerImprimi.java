package Operadores;

import java.util.Scanner;

public class ScannerImprimi {
    public static void main (String[] args) {
        int valor = 15 ;

        Scanner teclado = new Scanner(System.in); // Inserir valor pelo terminal

        System.out.println("Digite um valor: ");
        valor = teclado.nextInt();

        System.out.println(valor/2); // retorna numero inteiro
        System.out.println(valor%2);// retorna o restante da soma
    }
}
