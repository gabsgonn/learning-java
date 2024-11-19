import java.util.Scanner;

public class Ambiente {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Perguntando o nome
        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();

        // Perguntando a idade
        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();

        // Exibindo a mensagem final
        System.out.println("Olá " + nome + ", você tem " + idade + " anos de idade.");

        // Fechando o scanner
        scanner.close();
    }
}
