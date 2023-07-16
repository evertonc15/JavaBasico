import java.util.Locale;
import java.util.Scanner;

public class Tipoprimitivos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.1f \n", nome, nota);
        }
    }

