public class ExemploAviao {
    public static void main(String[ ] args) {
        Aviao aviao1 = new Aviao();
        aviao1.fabricante = "Boeing";
        aviao1.modelo = "777";
        aviao1.qtdeAssentos = 368;
        aviao1.ligar();
    }
}
//o erro ocorre porque o private faz com que o acesso a classe aviao fica privado e não pode ser acessado dessa forma