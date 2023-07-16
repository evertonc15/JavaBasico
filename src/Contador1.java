public class Contador1 {
    public static void main(String[] args) {
        int cc = 0;
        while (cc < 10) {
            cc++;
            if (cc == 2 || cc == 6){
                continue;
            }
            if (cc == 8) {
                break;
            }
            System.out.println("Cambalhota" + cc);
        }
    }
}
