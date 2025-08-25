package ModificadorProtected;

public class AlunoTeste {
    public static void main (String[] args){

        AlunoSuperior aluno  = new AlunoSuperior();

        aluno.setNome("Wagner");
        aluno.setTeste(9);
        aluno.setProva(10);

        System.out.println(aluno.getNome());
        System.out.println(aluno.getMedia());
    }
}
