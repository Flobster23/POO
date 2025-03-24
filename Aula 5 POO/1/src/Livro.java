public class Livro {
    private String titulo, autor;
    private static int contador = 0;

    public Livro(){
        titulo = "Desconhecido";
        autor = "Anônimo";
        contador++;
    }

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        contador++;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public static int getContador(){
        return contador;
    }
}
