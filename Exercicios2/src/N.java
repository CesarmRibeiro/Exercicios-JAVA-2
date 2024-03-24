package Exercicios2;
import java.util.Scanner;

public class N {
    public static void main(String[] args) {

        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        idade = sc.nextInt();

        if (idade <0 ) {
            System.out.println("Idade invalida");
        }
        else {
            if (idade <= 10) {
                System.out.println("Voce esta na categoria Infantil");
            } else if (idade <= 14) {
                System.out.println("Voce esta na categoria Junior");
            } else if (idade <= 20) {
                System.out.println("Voce esta na categoria Adolescente");
            } else if (idade <= 35) {
                System.out.println("Voce esta na categoria Jovem");
            } else {
                System.out.println("Voce esta na categoria Master");
            }
        }
    }
}
