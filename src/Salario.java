import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        Float salario = scanner.nextFloat();

        System.out.println("Digite o seu abono: ");
        Float abono = scanner.nextFloat();

        Float novoSalario = salario + abono;

        System.out.printf("Seu novo salário é: %.2f", novoSalario);

    }
}
