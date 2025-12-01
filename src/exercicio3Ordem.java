import java.util.Objects;
import java.util.Scanner;

/**
 * Escreva um código que o usuário entre com um número, e o segundo número maior
 * e escolha entre a opção par e ímpar, com isso deve informar todos os números pares ou ímpares
 * de acordo com a seleção, no intervalo de números informados,
 * inclindo os números em órdem decrescente.
 */

public class exercicio3Ordem {
    static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        var number1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        var number2 = scanner.nextInt();
        System.out.println("Digite {par/impar}: ");
        var opcao = scanner.next();

        if (Objects.equals(opcao, "par")) {
            if (number1 > number2) {
                while (number1 > number2) {
                    System.out.println(number1);
                    if (number1 % 2 == 0) {
                        number1 -= 2;
                    } else {
                        number1 -= 1;
                    }
                }
            } else {
                while (number2 > number1) {
                    System.out.println(number2);
                    if (number2 % 2 == 0) {
                        number2 -= 2;
                    } else {
                        number2 -= 1;
                    }
                }
            }
        } else {
            if (number1 > number2) {
                while (number1 > number2) {
                    System.out.println(number1);
                    if (number1 % 2 == 0) {
                        number1 -= 1;
                    } else {
                        number1 -= 2;
                    }
                }
            } else {
                while (number2 > number1) {
                    System.out.println(number2);
                    if (number2 % 2 == 0) {
                        number2 -= 1;
                    } else {
                        number2 -= 2;
                    }
                }
            }
    };


    }
}
