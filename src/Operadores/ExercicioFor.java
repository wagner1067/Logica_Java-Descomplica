package Operadores;

import java.util.Scanner;

public class ExercicioFor {
    public static void main (String[] args){

        double nota1, nota2, nota3, media;

        Scanner input = new Scanner(System.in);

        for(int aluno = 1; aluno <= 2; aluno++) {
            System.out.println("Aluno " + aluno);
            System.out.println("Digite a nota 1 : ");
            nota1 = input.nextDouble();
            System.out.println("Digite a nota 2 : ");
            nota2 = input.nextDouble();
            System.out.println("Digite a nota 3 : ");
            nota3 = input.nextDouble();
            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("Média: " + media);
        }
    }
}
