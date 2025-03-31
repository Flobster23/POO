public class teste {
    public static void main(String[] args) {
        int[] vetor = new int[] {11, 8, 5, 4, 4, 0};
        int[] diferenca = new int[3];
        int max = diferenca[0];
        int j = 0, X = 4, maiores = 0, menores = 0, iguais = 0;

        for(int i = 0; i < vetor.length; i += 2){
            diferenca[j] = vetor[i] - vetor[i + 1];
            if(diferenca[j] > max){
                max = diferenca[j];
            }
            j++;
        }

        for(int v : vetor){
            if(v == X){
                iguais++;
            }
            if(v > X){
                maiores ++;
            }
            if(v < X){
                menores++;
            }
        }

        System.out.println("Maior diferença: " + max);
        System.out.println("Iguais a X: " + iguais);
        System.out.println("Maiores que X: " + maiores);
        System.out.println("Menores que X: " + menores);

    }
}
