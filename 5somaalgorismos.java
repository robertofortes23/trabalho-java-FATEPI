import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite um numero: ");

        int numero = new Scanner(System.in).nextInt();
        int soma = 0;

        while (numero > 0) {

            soma += (numero % 10);
            numero /= 10;
        }
        System.out.println();
        System.out.println("A soma é: " + soma);

    }
}