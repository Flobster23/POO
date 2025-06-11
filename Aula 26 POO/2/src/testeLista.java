import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class testeLista {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("S");
        lista.add("B");
        lista.add("UUUUUUU");
        imprimeLista(lista);
        Collections.sort(lista);
        imprimeLista(lista);
        System.out.println(Collections.binarySearch(lista, "B"));
        Collections.reverse(lista);
        imprimeLista(lista);
        System.out.println(Collections.replaceAll(lista, "B", "UUUUUU"));
        Collections.rotate(lista, 2);
        imprimeLista(lista);
    }

    public static void imprimeLista(ArrayList<String> lista){
        for (String s : lista) {
            System.out.print(s + " - ");
        }
        System.out.println();
    }
}
