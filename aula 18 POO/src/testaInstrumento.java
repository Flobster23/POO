public class testaInstrumento {
    public static void main(String[] args) {
        Instrumento[] instrumentos = new Instrumento[5];
        instrumentos[0] = new Percursao();
        instrumentos[1] = new Sopro();
        instrumentos[2] = new Corda();
        instrumentos[3] = new SoproMadeira();
        instrumentos[4] = new SoproMetal();
        Sinfonia(instrumentos);
    }
    public static void Sinfonia(Instrumento[] instrumentos){
        for(Instrumento i : instrumentos){
            i.nome();
            i.afinar();
            i.tocar();
            System.out.println();
        }
    }
}
