import java.util.Objects;
import java.util.Scanner;

/**
 * Escreva um código que o usuário informa o número inicial, posteriormente irá informar
 * outros N numeros, a execução do código irá continuar até que o número informado dividido pelo primeiro
 * número tenha resto diferente de 0 na divisão, números menores que o primerio deverão ser descartados
 */

public class exercicio4resto {
    static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        var number1 = scanner.nextInt();
        var result = 0;
        do {
            System.out.println("Digite outro número: ");
            var number2 = scanner.nextInt();
            if (number1 > number2) {
                System.out.printf("Digite um número maior que %s\n", number1);
                System.out.println("============================================");
                continue;
            }
            result = number2 % number1;
            System.out.printf("%s %% %S = %s \n" , number1, number2, result);
        } while (result == 0);
    }
}
