public class Cozinha {
    Geladeira geladeira;
    Microondas microondas;
    Liquidificador liquidificador;

    public Cozinha(Geladeira geladeira, Microondas microondas, Liquidificador liquidificador){
        this.geladeira = geladeira;
        this.liquidificador = liquidificador;
        this.microondas = microondas;
    }

    void ligarTodos(){
        geladeira.ligar();
        liquidificador.ligar();
        microondas.ligar();
    }

    void desligarTodos(){
        geladeira.desligar();
        liquidificador.desligar();
        microondas.desligar();
    }
}
