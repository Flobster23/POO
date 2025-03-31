public class teste {
    public static void main(String[] args) {
        System.out.println(soma(1, 5, 67));
        System.out.println(soma(1, 2));
        System.out.println(soma());
    }

    public static int soma(int ... numeros){
        int total = 0;
        for(int n : numeros){
            total += n;
        }
        return total;
    }
}
