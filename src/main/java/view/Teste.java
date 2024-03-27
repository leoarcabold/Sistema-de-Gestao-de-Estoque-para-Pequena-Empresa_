package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[2];
        do {


            try {
                double x = scanner.nextDouble();
                double y = x / 10;

                System.out.println(y);
                System.out.println(vetor[3]);


            } catch (InputMismatchException e) {
                System.out.println("caracter invalido");
                msg();
                main(args);

            } catch (RuntimeException e) {
//            throw new TesteException("Este é um tipo lançado de exceçaõ"+ e.getStackTrace());
                System.out.println(e);
            }

        }while (true);
    }

    public static void msg(){
        System.out.println("Erro; tente na proxima");
    }
}
