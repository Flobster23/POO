import java.util.*;
public class Exercicio2{
    public static void main(String[] args) {
        String[] cores = {"vermelho", "branco", "azul", "verde", "cinza",
                "laranja", "laranja", "cinza","vermelho"};

        HashSet<String> hs = new HashSet<String>();
        for(String s : cores){  
            hs.add(s);
        }

        TreeSet<String> ts = new TreeSet<String>();
        for(String s : cores){
            ts.add(s);
        }



        List <String> list = new ArrayList<>(Arrays.asList(cores));

        printCollection(list);
    }

    private static void printCollection(List<String> list) {

    }
}

