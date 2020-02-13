import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int idaeTia;
        int idadePrimo;

        // Enter username and press Enter
        System.out.println("Digite a idade da sua tia");
        idaeTia = myObj.nextInt();

        System.out.println("Digite a idade do se primo");
        idadePrimo = myObj.nextInt();

        System.out.println("idade tia " + idaeTia);
        System.out.println("idade Primo " + idadePrimo);

        int diferenca = idaeTia - 21;

        System.out.println("Minha tia tem " + diferenca + " anos a mais do que eu!");
    }
}