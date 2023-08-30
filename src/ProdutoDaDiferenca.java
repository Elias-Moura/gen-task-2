import java.util.Scanner;

public class ProdutoDaDiferenca {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        float n1, n2, n3, n4;
        String mensagem = "Por favor, digite apenas 4 numeros separador por espaço.";
        System.out.println("Digite 4 numeros separados por espaço.");
        String valores = scanner.nextLine();

        String[] numerosTexto = valores.split(" ");

        if (numerosTexto.length != 4) {
            System.out.println(mensagem);
        }

        try {
            n1 = Float.parseFloat(numerosTexto[0]);
            n2 = Float.parseFloat(numerosTexto[1]);
            n3 = Float.parseFloat(numerosTexto[2]);
            n4 = Float.parseFloat(numerosTexto[3]);

            var calculoDaDiferenca = (n1 * n2) - (n3 * n4);

            System.out.println(calculoDaDiferenca);

        } catch (NumberFormatException e) {
            System.out.println(String.format("Erro ao converter os numeros. %s", mensagem));
        }
    }
}
