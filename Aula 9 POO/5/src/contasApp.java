public class contasApp {
    public static void main(String[] args) {
        contaCorrente[] contas = new contaCorrente[3];
        contas[0] = new contaCorrente(500.90);
        contas[1] = new contaCorrente(0);
        contas[2] = new contaCorrenteEspecial(989.67);

        contas[0].sacar(100.0);
        contas[1].depositar(99.90);
        contas[2].sacar(100.0);
        contas[2].sacar(1000.0);

        for(contaCorrente c : contas){
            System.out.println(c.getSaldo());
        }

    }
}
