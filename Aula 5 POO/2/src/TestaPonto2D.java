public class TestaPonto2D {
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D();
        Ponto2D p2 = new Ponto2D(1,3);

        System.out.print("Coordenadas de P1: ");
        System.out.printf("%.2f ", p1.getX() );
        System.out.printf("%.2f ", p1.getY() );

        System.out.print("Coordenadas de P2: ");
        System.out.printf("%.2f ", p2.getX() );
        System.out.printf("%.2f ", p2.getY() );

    }
}
