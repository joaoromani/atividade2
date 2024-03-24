import java.util.Scanner;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

public class atividade01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int a, b;
    
    System.out.println("Digite o primeiro número: ");
    a = teclado.nextInt();    
    System.out.println("Digite o segundo número: ");
    b = teclado.nextInt();
    teclado.close();
    if (a > b) {
      System.out.println("O maior número inserido é o " + a);
    }
    else if (a == b) {
      System.out.println("Os números inseridos são iguais!");
    }
    else {
      System.out.println("O maior número inserido é o " + b);
    }
  }

}