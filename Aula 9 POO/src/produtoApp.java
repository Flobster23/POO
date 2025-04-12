public class produtoApp {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];
        produtos[0] = new Produto("Geladeira", 990.90);
        produtos[1] = new Livro("Harry Potter 2", 80.01, 299);
        produtos[2] = new Livro("Harry Potter 3", 120.00, 301);

        for(Produto p : produtos){
            if(p.ehCaro(p.getPreco())){
                System.out.println(p.getNome() + " eh caro");
            }else{
                System.out.println(p.getNome() + " nao eh caro");
            }
        }

        if(((Livro)produtos[1]).ehExtenso(((Livro)produtos[1]).getPagina())) {
            System.out.println(produtos[1].getNome() + " eh extenso");
        }else{
            System.out.println(produtos[1].getNome() + " nao eh extenso");
        }

        if(((Livro)produtos[2]).ehExtenso(((Livro)produtos[2]).getPagina())) {
            System.out.println(produtos[2].getNome() + " eh extenso");
        }else{
            System.out.println(produtos[2].getNome() + " nao eh extenso");
        }
    }
}
