package OrientacaoObjeto;

public class ClasseAbstrata {
    public static void main (String[] args){

        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        AlunoEnsinoSuperior alunoEnsinoSuperior = new AlunoEnsinoSuperior();

        alunoEnsinoMedio.nome = "Wagner";
        alunoEnsinoMedio.teste = 8;
        alunoEnsinoMedio.prova = 9;

        System.out.println("Aluno do Ensino médio: ");
        System.out.println("Nome: " + alunoEnsinoMedio.nome);
        System.out.println("Média: " + alunoEnsinoMedio.getMedia());

        alunoEnsinoSuperior.nome = "Gabriele";
        alunoEnsinoSuperior.teste = 8;
        alunoEnsinoSuperior.prova = 9;

        System.out.println("Aluno do Ensino superior: ");
        System.out.println("Nome: " + alunoEnsinoSuperior.nome);
        System.out.println("Média: " + alunoEnsinoSuperior.getMedia());
    }
}
