import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        float nota1, nota2, nota3, nota4;

        System.out.println("Digite a nota1: ");
        nota1 = scanner.nextFloat();

        System.out.println("Digite a nota2: ");
        nota2 = scanner.nextFloat();

        System.out.println("Digite a nota3: ");
        nota3 = scanner.nextFloat();

        System.out.println("Digite a nota4: ");
        nota4 = scanner.nextFloat();

        var media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Sua média final é %.1f", media);
    }
}
