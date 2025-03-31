public class teste {
    public static void main(String[] args) {
        double soma = 0;
        double[] vetor = new double[] {1, 5, 54, 78.6, 0.5};

        for (double v : vetor) {
            soma += v;
        }

        System.out.println(soma / vetor.length);
    }
}
