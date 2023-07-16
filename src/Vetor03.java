import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetor03 {
    public static void main(String[] args) {
        double v[] = {3.5, 2.65, 9, -15.5};
        Arrays.sort(v);
        for(double valor: v){
            System.out.println(valor);
        }
    }
}
