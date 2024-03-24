import java.util.Scanner;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

public class atividade05 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int lado1, lado2, lado3 ;
       
    System.out.println("Digite o comprimento do primeiro lado do triangulo: ");
    lado1 = teclado.nextInt();
    System.out.println("Digite o comprimento do segundo lado do triangulo: ");
    lado2 = teclado.nextInt();
    System.out.println("Digite o comprimento do terceiro lado do triangulo: ");
    lado3 = teclado.nextInt();
    teclado.close();
    if (lado1 == lado2 && lado2 == lado3) {
      System.out.println("O triângulo é equilátero");
    } 
    else if (lado1 != lado2 && lado2 == lado3) {
      System.out.println("O triângulo é isósceles");
    } 
    else{
      System.out.println("O triângulo é escaleno");
    }

  }

}