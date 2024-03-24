import java.util.Scanner;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

public class atividade03 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String prod;
    float preco1, preco2;
    
    System.out.println("Digite o nome do produto: ");
    prod = teclado.nextLine();    
    System.out.println("Digite o primeiro preço: ");
    preco1 = teclado.nextFloat();
    System.out.println("Digite o segundo preço: ");
    preco2 = teclado.nextFloat();
    teclado.close();
    if (preco1 < preco2) {
      System.out.println("O produto " + prod + " é mais barato no primeiro estabelecimento.");
    } else {
      System.out.println("O produto " + prod + " é mais caro no primeiro estabelecimento.");
    }
  }

}