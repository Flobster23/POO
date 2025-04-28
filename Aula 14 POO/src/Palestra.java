public class Palestra {
    Luz luz;
    public Palestra(Luz luz){
        this.luz = luz;
    }
    public void setLuz(Luz luz){
        this.luz = luz;
    }
    public void verifica(){
        switch (luz){
            case AMBAR:
                System.out.println("palestra sendo liberada");
                break;
            case VERMELHO:
                System.out.println("palestra indisponível");
                break;
            case VERDE:
                System.out.println("palestra disponível");
                break;
        }
    }

}
