import java.util.*;

public class main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Joao");
        nomes.add("maria");
        nomes.add("Jose");
        ListIterator<String> iter = nomes.listIterator();
        while(iter.hasPrevious()){
            String elemento = iter.previous();
            System.out.println(elemento);
        }
    }
}
