public class Retangulo {
    private double comprimento, largura;

    public Retangulo(){
        comprimento = 1;
        largura = 1;
    }

    public Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getPerimetro(double comprimento, double largura){
        return( 2 * (comprimento + largura));
    }

    public double getArea(double comprimento, double largura){
        return(comprimento * largura);
    }
}
