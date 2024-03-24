package Exercicios2;
import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        double a1,a2,a3, media;

        System.out.print("A1= ");
        a1 = sc.nextDouble();

        System.out.print("A2= ");
        a2 = sc.nextDouble();

        System.out.print("A3= ");
        a3 = sc.nextDouble();

        media = ((a1 * 3) + (a2 * 3) + (a3 * 4)) / 10;

        if (media >= 6 && media <= 10) {
            System.out.println("Aprovado");
        }

        else if (media > 4) {
            System.out.println("Exame");
        }

        else {
            System.out.println("Reprovado");
        }
    }
}