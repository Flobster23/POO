import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class testeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> alunoNota = new TreeMap<>();
        alunoNota.put("Guilherme", 10.0);
        alunoNota.put("Bizzi", 0.5);
        alunoNota.put("Giulia", 4.5);
        alunoNota.put("Caua", 0.1);
        alunoNota.put("Querubim", 11.5);

        Set<Map.Entry<String, Double>> set = alunoNota.entrySet();

        for(Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + " - ");
            System.out.println(me.getValue());
        }

        alunoNota.put("Guilherme", 9.9);

        for(Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + " - ");
            System.out.println(me.getValue());
        }
    }
}
