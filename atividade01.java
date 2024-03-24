import java.util.Scanner;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

public class atividade01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int a;
    
    System.out.println("Digite uma nota entre 0 a 10: ");
    a = teclado.nextInt();
    teclado.close();
    if (a>=0 && a<=10) {
      System.out.println("A nota inserida é valida");
    } else{
      System.out.println("A nota inserida não é valida");
    }
  }

}
