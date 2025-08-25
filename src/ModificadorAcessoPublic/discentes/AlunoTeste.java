package ModificadorAcessoPublic.discentes;

public class AlunoTeste {
    public static void main (String[] args){

        AlunoSuperior aluno  = new AlunoSuperior();

        aluno.nome="Wagner";
        aluno.teste= 9;
        aluno.prova=10;

        System.out.println(aluno.getMedia());
    }
}
