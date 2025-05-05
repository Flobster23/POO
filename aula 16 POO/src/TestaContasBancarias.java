public class TestaContasBancarias {
    public static void main(String[] args) {
        //java: ContaBancaria is abstract; cannot be instantiated
        ContaSimples c1 = new ContaSimples("conta 1");
        c1.deposita(1000);
        c1.retira(2000);
        c1.retira(500);
        System.out.println(c1.getSaldo());

        ContaEspecial c2 = new ContaEspecial("conta 2", 5000);
        c2.deposita(1000);
        c2.retira(2000);
        System.out.println(c2.getSaldo());
    }
}
