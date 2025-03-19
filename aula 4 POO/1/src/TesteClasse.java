public class TesteClasse {
    public static void main(String[] args) {
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();

        turma1.setCurso("Ciência da Computação");
        turma1.setDisciplina("POO");
        turma1.exibeDados();

        turma2.setCurso("Psicologia");
        turma2.setDisciplina("Yap Session");
        turma2.exibeDados();

        System.out.println("Curso: " + turma1.getCurso());
        System.out.println("Disciplina: " + turma1.getDisciplina());

        System.out.println("Curso: " + turma2.getCurso());
        System.out.println("Disciplina: " + turma2.getDisciplina());
    }
}
