public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.setTitulo("Harry Potter");
        livro1.setAutor("Caua Monteiro");
        livro1.exibeDados();

        livro2.setTitulo("O receptaculo da sombra");
        livro2.setAutor("Vinicius Nedochetko");
        livro2.exibeDados();

        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());

        System.out.println("Titulo: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
    }
}
