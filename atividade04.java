import java.util.Scanner;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

public class atividade04 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int nota1, nota2, nota3, soma, media;
       
    System.out.println("Digite a primeira nota: ");
    nota1 = teclado.nextInt();
    System.out.println("Digite a segunda nota: ");
    nota2 = teclado.nextInt();
    System.out.println("Digite a terceira nota: ");
    nota3 = teclado.nextInt();
    teclado.close();
    soma = nota1 + nota2 + nota3;
    media = soma / 3;
    if (media >= 7) {
      System.out.println("O aluno foi aprovado!");
    } else {
      System.out.println("O aluno foi reprovado!");
    }
  }

}