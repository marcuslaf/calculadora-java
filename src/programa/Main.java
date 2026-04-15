package programa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a operação desejada (+, -, *, /):");
        char op = sc.next().charAt(0);

        System.out.println("Digite o primeiro número");
        double n1 = sc.nextDouble();
        System.out.println("Digite o segundo número");
        double n2 = sc.nextDouble();

        double resultado;

        switch (op) {
            case '+':
                System.out.println("Resultado = " + (n1 + n2));
                break;
            case '-':
                System.out.println("Resultado = " + (n1 - n2));
                break;
            case '*':
                System.out.println("Resultado = " + (n1 * n2));
                break;
            case '/':
                if (n2 != 0) {
                    System.out.println("Resultado =  " + (n1 / n2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }
    }
}