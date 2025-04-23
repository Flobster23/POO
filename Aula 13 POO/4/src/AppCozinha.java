public class AppCozinha {
    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira();
        Microondas microondas = new Microondas();
        Liquidificador liquidificador = new Liquidificador();
        Cozinha cozinha = new Cozinha(geladeira,microondas, liquidificador);

        cozinha.ligarTodos();
        geladeira.observar();
        liquidificador.observar();
        microondas.observar();

        cozinha.desligarTodos();
        geladeira.observar();
        liquidificador.observar();
        microondas.observar();
    }
}
