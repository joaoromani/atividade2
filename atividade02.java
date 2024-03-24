import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String username, password;
        // Solicita o nome de usuário
        System.out.println("Digite o nome de usuário:");
        username = teclado.nextLine();
        
        // Solicita a senha
        System.out.println("Digite a senha:");
        password = teclado.nextLine();
        
        // Verifica se a senha é igual ao nome de usuário
        if (password.equals(username)) {
            System.out.println("A senha não pode ser igual ao nome de usuário. Tente novamente!");
            password = teclado.nextLine(); // Solicita uma nova senha
        }
        
        System.out.println("Nome de usuário e senha cadastrados com sucesso.");
        
        teclado.close();
    }
}
