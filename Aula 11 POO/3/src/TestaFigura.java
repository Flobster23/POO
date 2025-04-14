public class TestaFigura {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        figuras[0] = new Figura();
        figuras[1] = new Quadrado();
        figuras[2] = new Circulo();
        for(Figura f : figuras){
            System.out.println(f.area(5));
        }

    }
}
