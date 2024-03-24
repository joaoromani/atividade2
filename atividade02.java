import java.util.Scanner;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

public class atividade02 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int a, b, c;
    
    System.out.println("Digite o primeiro número: ");
    a = teclado.nextInt();    
    System.out.println("Digite o segundo número: ");
    b = teclado.nextInt();
    System.out.println("Digite o segundo número: ");
    c = teclado.nextInt();
    teclado.close();
    if (a > b && a > c) {
      System.out.println("O maior número inserido é o " + a);
    }
    else if (b > a && b > c) {
      System.out.println("O maior número inserido é o" + b);
    }
    else if (c > a && c > b) {
      System.out.println("O maior número inserido é o " + c);
    }
  }

}