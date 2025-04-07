public class contaCorrente {
    double saldo;

    public contaCorrente(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxa(){
        return 0.02;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(saldo < valor){
            System.out.println("Saldo insuficiente");
        }else{
            saldo -= valor;
            valor = valor - (getTaxa() * valor);
            System.out.println("Valor sacado descontando a taxa: " + valor);
        }
    }
}
