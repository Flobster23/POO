public class Geladeira {
    boolean ligado = false;
    void ligar(){
        ligado = true;
    }
    void desligar(){
        ligado = false;
    }
    boolean isLigado(){
        return ligado;
    }
    void observar(){
        if(isLigado()){
            System.out.println("Geladeira ligada");
        }else{
            System.out.println("Geladeira desligada");
        }
    }
}
