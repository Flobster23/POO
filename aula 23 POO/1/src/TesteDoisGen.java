public class TesteDoisGen {
    public static void main(String[] args) {
        DoisGen<Integer, Integer> iOb = new DoisGen<>(4, 4);
        DoisGen<String, Double> strOb = new DoisGen<>("bus", 5.8);

        iOb.showTypeT();
        iOb.showTypeV();

        int v = iOb.getOb1();
        int t = iOb.getOb2();
        System.out.println("valor: " + v);
        System.out.println("valor: " + t);

        System.out.println();
    }
}
