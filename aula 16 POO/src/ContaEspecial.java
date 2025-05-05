public class ContaEspecial extends ContaBancaria{
    private double adicional;
    public ContaEspecial(String nome, double adicional){
        super(nome);
        saldo = 0;
        this.adicional = adicional;
    }
    @Override
    public void retira(double valor) {
        if((saldo - valor + adicional) >= 0){
            saldo -= valor;
        }else{
            System.out.println("Erro, saldo insuficiente");
        }
    }
}
