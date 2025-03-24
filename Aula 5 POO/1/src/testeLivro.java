public class testeLivro {
    public static void main(String[] args) {
        System.out.println(Livro.getContador());
        Livro l1 = new Livro();
        System.out.println(Livro.getContador());
        Livro l2 = new Livro("Harry Potter", "Pedro Ribas");
        System.out.println(Livro.getContador());

        System.out.println("Titulo: " + l1.getTitulo());
        System.out.println("Autor: " + l1.getAutor());

        System.out.println("Titulo: " + l2.getTitulo());
        System.out.println("Autor: " + l2.getAutor());


    }
}
