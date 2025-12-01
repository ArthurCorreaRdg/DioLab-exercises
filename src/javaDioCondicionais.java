import java.util.Scanner;

public class javaDioCondicionais {
    static void main(String[] args) {
       var scanner  = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        var name = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        var age =  scanner.nextInt();
        System.out.println("Você é emancipado {s/n}: ");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        /* if (age >= 18) {
            System.out.printf("%s, você pode dirigir", name);
        } else if (age >= 16 && isEmancipated) {
            System.out.printf("%s, você pode dirigir", name);
        } else {
            System.out.printf("%s, você não pode dirigir", name);
        } */

        var message = ((age >= 18) || (age >= 16 && isEmancipated)) ? // ElvisOperator
                name + ", você pode dirigir" :
                name + ", você não pode dirigir";

        System.out.println(message);
    }
}
