public class Livro extends Produto {
    private int pagina;

    public Livro(String nome, double preco, int pagina){
        super(nome, preco);
        this.pagina = pagina;
    }

    public int getPagina(){
        return pagina;
    }

    public boolean ehExtenso(int pagina){
        return pagina > 300;
    }

    @Override
    public boolean ehCaro(double preco){
        return preco > 100.0;
    }

}
