public class Main {

    public static void main(String[] args) {

        int soma = 0;

        System.out.print("A soma dos 100 primeiros números é: ");
        for (int i = 1; i <= 100; i++)
            soma += i;
        // soma = soma + i
        System.out.println(soma);
    }
}