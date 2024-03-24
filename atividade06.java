import java.util.Scanner;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

public class atividade06 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Double consumo;
    Double tarifa1, tarifa2;
       
    System.out.println("Digite o consumo de energia em kW/h: ");
    consumo = teclado.nextDouble();
    teclado.close();
    consumo = consumo*0.85;
    tarifa1 = consumo * 0.15;
    tarifa2 = consumo * 0.10;
    if (consumo <= 100) {
        System.out.println("Valor da tarifa: R$" + (consumo-tarifa1));
    } else if (consumo >= 101 & consumo <= 200) {
        System.out.println("Valor da tarifa: R$" + (consumo-tarifa2));
    } else if( consumo > 200){
        System.out.println("Valor da tarifa: R$" + consumo);
    }
  }

}