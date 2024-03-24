// import java.util.Scanner;

// // import static org.junit.jupiter.api.Assertions.assertEquals;
// // import org.junit.jupiter.api.Test;

// public class atividade07 {
//   public static void main(String[] args) {
//     Scanner teclado = new Scanner(System.in);
//     double salario;
//     String classificacao;
//     double bonus1, bonus2;
       
//     System.out.println("Digite o salario do funcionário: ");
//     salario = teclado.nextDouble();
//     System.out.println("Digite a classificação do funcionário: ");
//     classificacao = teclado.nextLine();
//     teclado.close();
//     bonus1 = salario * 0.2;
//     if (classificacao == "A") {
//         System.out.println("Valor do bônus: " + (salario+bonus1));
//     }    
//   }

// }

import java.util.Scanner;

public class atividade07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario;
        String classificacao;
        double bonus1, bonus2, bonus3;
           
        System.out.println("Digite o salário do funcionário: ");
        salario = teclado.nextDouble();
        teclado.nextLine(); // Limpar o buffer do teclado

        System.out.println("Digite a classificação do funcionário: ");
        classificacao = teclado.next().toUpperCase();
        teclado.close();
        
        bonus1 = salario * 0.2;
        bonus2 = salario * 0.15;
        bonus3 = salario * 0.1;
        if (classificacao.equals("A")) {
            System.out.println("Valor do bônus: " + bonus1);
        }    
        else if (classificacao.equals("B")) {
            System.out.println("Valor do bônus: " + bonus2);
        }
        else if (classificacao.equals("C")) {
            System.out.println("Valor do bônus: " + bonus3);
        }
        else {
            System.out.println("Classificação sem bonus!");
        }
    }
}
