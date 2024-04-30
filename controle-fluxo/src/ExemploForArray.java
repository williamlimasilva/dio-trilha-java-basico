public class ExemploForArray {
    public static void main(String[] args) {
        String[] alunos = { "Marcelo","joão","William","André"};

        /*for (int aluno=0; aluno<alunos.length; aluno++) {
            System.out.println("O aluno no indice " + aluno + " é " + alunos[aluno]);
        }*/
        for ( String aluno : alunos ) {
            System.out.println("Os alunos são " + aluno);
        }
    }
}
