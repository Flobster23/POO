public class testadora {
    public static void main(String[] args) {
        Luz luz;
        luz = Luz.VERMELHO;
        Palestra palestra = new Palestra(luz);
        palestra.verifica();
        palestra.setLuz(Luz.AMBAR);
        palestra.verifica();
        palestra.setLuz(Luz.VERDE);
        palestra.verifica();
    }
}
