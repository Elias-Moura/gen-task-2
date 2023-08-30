import java.util.Scanner;

public class NovoSalario {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        float salarioBruto, adicionalNoturno, horasExtras, descontosColaborador;

        System.out.println("Informe seu salário bruto: ");
        salarioBruto = scanner.nextFloat();

        System.out.println("Informe seu salário adicional: ");
        adicionalNoturno = scanner.nextFloat();

        System.out.println("Informe seu horas extras: ");
        horasExtras = scanner.nextFloat();

        System.out.println("Informe seu descontos do colaborador: ");
        descontosColaborador = scanner.nextFloat();

        var salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontosColaborador;

        System.out.println(String.format("Seu novo salário é R$ %,.2f", salarioLiquido));
    }
}
