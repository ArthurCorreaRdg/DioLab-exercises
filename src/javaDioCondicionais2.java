import java.util.Scanner;

/**
 * Switch Case
 */
public class javaDioCondicionais2 {
    static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 7: ");
        var option =  scanner.nextInt();
        switch (option) {
            case 1, 7 -> System.out.println("Final de Semana");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            default -> System.out.println("Opção Inválida");
        }
    }
}
