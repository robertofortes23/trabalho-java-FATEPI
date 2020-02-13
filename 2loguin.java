import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu usuario");
        String login = in.nextLine();
        System.out.println("Digite a senha:");
        String senha = in.nextLine();

        if (login.equals("roberto") && senha.equals("123456")) {
            System.out.printf("Usuário %s Logado.", login);
        } else {
            System.out.println("Login inválido.");
        }
    }
}