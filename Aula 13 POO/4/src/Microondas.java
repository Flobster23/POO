public class Microondas {
    boolean ligado = false;
    void ligar(){
        ligado = true;
    }
    void desligar(){
        ligado = false;
    }
    boolean isLigado(boolean ligado){
        if(ligado = true){
            return true;
        }
        return false;
    }
    void observar(){
        if(isLigado(ligado)){
            System.out.println("Microondas ligado");
        }else{
            System.out.println("Microondas desligado");
        }
    }
}
