public class contaCorrenteEspecial extends contaCorrente{
    public contaCorrenteEspecial(double saldo){
        super(saldo);
    }
    public double getTaxa(){
        return 0.01;
    }
}
