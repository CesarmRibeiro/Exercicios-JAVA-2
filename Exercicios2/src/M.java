package Exercicio2;
import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int cc;

        System.out.println("Fale quantas cc (cilindradas) tem seu carro");
        cc = sc.nextInt();


        if (cc < 120) {
            System.out.println("Sub Production");
        }

        else if (cc < 240) {
            System.out.println("Production");
        }

        else {
            System.out.println("Super Production");
        }

    }
}
