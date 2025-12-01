import java.util.Scanner;

public class exercicio1Tabuada {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        var number = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            var mult = number * i;
            System.out.print(number + "x" + i + "=" + mult + "\n");
        }
    }
}
