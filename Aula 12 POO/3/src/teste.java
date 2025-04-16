import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.next();
        verificar(palavra);

    }
    public static void verificar(String palavra){
        if(palavra.length() < 8){
            System.out.println("palavra possui menos de 8 caracteres");
        }else{
            String comeco = palavra.substring(0,2);
            String finalS = palavra.substring(palavra.length() - 2);
            System.out.println(comeco + finalS);
        }
    }
}
