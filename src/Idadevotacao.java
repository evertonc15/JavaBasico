import java.util.Scanner;

public class Idadevotacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int nascimento = teclado.nextInt();
        int idade = 2023 - nascimento;
        System.out.println("Sua idade é: " + idade);
        if (idade < 16) {
            System.out.println("Não vota!");
        }
        else {
            if ((idade >= 16 && idade < 18) || (idade > 70)) {
                System.out.println("Opcional!");
            }
            else {
                System.out.println("Voto Obrigatório!");
            }
        }
    }
}
