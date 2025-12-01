import java.util.Scanner;

public class exercicio2TabelaImc {
    static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        var weight = scanner.nextDouble();
        System.out.println("Digite sua altura em cm:");
        var height = scanner.nextDouble();

        var imc = (weight/(Math.pow(height,2))*10000);

        var message = (imc <= 18.5) ? "Você está abaixo do peso" :
                (imc <= 24.9) ? "Você está no peso ideal" :
                (imc <= 29.9) ? "Você está levemente acima do peso" :
                (imc <= 34.9) ? "Você está com Obeisdade Grau I":
                (imc <= 39.9) ? "Você está com Obeisdade Grau II" :
                        "Você está com Obeisdade Grau III"; // ElvisOperator
        System.out.println(imc);
        System.out.println(message);
    }
}
