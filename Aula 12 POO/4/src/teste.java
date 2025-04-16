import java.util.Scanner;

import static java.lang.constant.ConstantDescs.NULL;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.next();
        String novaPalavra = processa(palavra);
        System.out.println(novaPalavra);
    }
    public static String processa(String palavra){
        if(palavra == NULL){
            return (String) NULL;
        }else{
            return palavra.toUpperCase();
        }
    }
}
