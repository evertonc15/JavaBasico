import java.util.Scanner;

public class ProgramaPernas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas: ");
        int perna = teclado.nextInt();
        String tipo;
        System.out.print("Isso é um(a): ");
        tipo = switch (perna) {
            case 1 -> "Saci";
            case 2 -> "Bípede";
            case 3 -> "Tripé";
            case 4 -> "Quadrupíde";
            case 6 -> "Aranha";
            default -> "ET";
        };
        System.out.println(tipo);
    }
}
