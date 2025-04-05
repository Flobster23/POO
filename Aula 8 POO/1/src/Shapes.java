public class Shapes {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        Retangulo r1 = new Retangulo();

        t1.setLargura(4.0);
        t1.setAltura(4.0);
        t1.setEstilo("cheio");

        t2.setLargura(8.0);
        t2.setAltura(12.0);
        t2.setEstilo("contorno");

        r1.setAltura(2.0);
        r1.setLargura(2.0);

        System.out.println("Info para t1: ");
        t1.mostraEstilo();
        t1.mostraDim();
        System.out.println("Area = " + t1.area());
        System.out.println();
        System.out.println("Info para t2: ");
        t2.mostraEstilo();
        t2.mostraDim();
        System.out.println("Area = " + t2.area());
        System.out.println();
        System.out.println("Info para r1: ");
        System.out.println("Area = " + r1.areaRetangulo());
        if (r1.isSquare()) {
            System.out.println("É um quadrado.");
        }
        else {
            System.out.println("É um retangulo.");
        }
    }
}

//Aparece um erro para importar a altura e largura da classe twoDShape no metod araea da classe triangulo. portanto deve-se mudar os atributos e usar os metodos getter's.
