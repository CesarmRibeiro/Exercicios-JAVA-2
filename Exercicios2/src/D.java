package Exercicios2;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num1, num2;

        System.out.println("Digie o primeiro numero: ");
        num1 = sc.nextFloat();

        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextFloat();

        if (num1 >num2){
            System.out.println("Segundo numero menor");
        }

        else if (num2 > num1){
            System.out.println("Primeiro numero menor");
        }

        else {
            System.out.println("Numeros iguais");
        }

    }

}