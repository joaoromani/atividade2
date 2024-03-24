import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Solicita e valida o nome
        String nome = "";
        while (nome.length() <= 3) {
            System.out.println("Digite o nome (deve ter mais de 3 caracteres):");
            nome = teclado.nextLine();
        }
        
        // Solicita e valida a idade
        int idade = -1;
        if (idade < 0 || idade > 150) {
            System.out.println("Digite a idade (entre 0 e 150):");
            idade = teclado.nextInt();
        }
        
        // Solicita e valida o salário
        double salario = -1;
        if (salario <= 0) {
            System.out.println("Digite o salário (maior que zero):");
            salario = teclado.nextDouble();
        }
        
        // Solicita e valida o sexo
        char sexo = '\0';
        if (sexo != 'f' && sexo != 'm') {
            System.out.println("Digite o sexo ('f' ou 'm'):");
            sexo = teclado.next().charAt(0);
        }
        
        // Solicita e valida o estado civil
        char estadoCivil = '\0';
        if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
            System.out.println("Digite o estado civil ('s', 'c', 'v', 'd'):");
            estadoCivil = teclado.next().charAt(0);
        }
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
        
        teclado.close();
    }
}
