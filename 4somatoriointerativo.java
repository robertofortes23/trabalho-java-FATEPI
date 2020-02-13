import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Numero inicial ");
        int inicio = in.nextInt();
        System.out.println("Numero final ");
        int fim = in.nextInt();

        int soma = 0;

        while (inicio <= fim) {
            soma += inicio;
            inicio += 1;
        }
        System.out.println("Somatorio final de todos os numeros é " + soma);
    }
}