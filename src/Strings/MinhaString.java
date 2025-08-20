package Strings;

import java.util.Scanner;

public class MinhaString { // Renomeando a classe
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nome ;

        System.out.println("Digite o seu nome: ");
        nome = teclado.nextLine();// pega so o primeiro nome com NEXT e o NEXTLINE pega inteiro

        System.out.println("Professor " + nome);
    }
}