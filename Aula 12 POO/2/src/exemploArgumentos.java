public class exemploArgumentos {
    public static void main(String[] args) {
        String s1 = "sol", s2 = "Sol";
        apresentar(s1, s2);
        comparar(s1, s2);
    }

    public static void apresentar(String s1, String s2){
        System.out.println("s1 :" + s1);
        System.out.println("s2: " + s2);
    }

    public static void comparar(String s1, String s2){
        if(s1.equals(s2)){
            System.out.println("As strings são iguais");
        }else{
            System.out.println("As strings não são iguais");
        }
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("As strings são iguais ignorando case");
        }else{
            System.out.println("As strings não são iguais nem ignorando case");
        }
    }
}
