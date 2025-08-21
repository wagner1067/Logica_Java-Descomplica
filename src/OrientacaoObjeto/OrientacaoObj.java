package OrientacaoObjeto;

public class OrientacaoObj {
    public static void main (String[] args){
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        aluno.setNome("Wagner");
        aluno.teste = 9;
        aluno.prova= 10;

        System.out.println("Nome do aluno é: " + aluno.getNome());
        System.out.println("A Média é: " + aluno.getMedia());


        professor.setNome("Gabriele");
        professor.setSalario(1000);

        System.out.println("Nome do professor é: " + professor.getNome());
        System.out.println("Desconto do INSS é: " + professor.getInss());
        System.out.println("Salário Líquido é: " + professor.getSalarioLiquido());
    }
}
