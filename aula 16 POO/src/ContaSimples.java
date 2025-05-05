public class ContaSimples extends ContaBancaria{
    public ContaSimples(String nome){
        super(nome);
        saldo = 0;
    }
    @Override
    public void retira(double valor) {
        if((saldo - valor) >= 0){
            saldo -= valor;
        }else {
            System.out.println("erro, saldo insuficiente");
        }
    }
}
