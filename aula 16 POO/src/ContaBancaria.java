public abstract class ContaBancaria {
    private String nome;
    double saldo;
    public ContaBancaria(String nome){
        this.nome = nome;
        saldo = 0;
    }
    public abstract void retira(double valor);
    public void deposita(double valor){
        saldo += valor;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
