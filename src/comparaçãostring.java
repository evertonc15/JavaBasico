public class comparaçãostring {
    public static void main(String[] args) {
        String nome1 = "Everton";
        String nome2 = "EvertonC";
        String nome3 = new String("Everton");
        String res = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println(res);
    }
}
