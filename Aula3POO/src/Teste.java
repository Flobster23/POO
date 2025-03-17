public class Teste {
    public static void main(String[] args){
        Universidade UNICENTRO = new Universidade();
        UNICENTRO.nome = "UNICENTRO";
        UNICENTRO.cidade = "Guarapuava";
        UNICENTRO.estado = "PR";
        UNICENTRO.exibeDados();

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Guilherme";
        aluno1.curso = "Ciencia da Computacao";
        aluno1.exibeDados();
    }
}
