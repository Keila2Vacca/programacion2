package com.mycompany.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public Calculator() {
    }

    public int division(int a, int b) {
        /*if(b <= 0){
          System.out.println("Operación no permitida");
          return -1;
      }
         */ //evita la exepción con validación

        boolean repeat;
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            repeat = false;
            try {
                result = a/b;
            } catch (ArithmeticException e) {
                System.out.println("Operación no válida");
                System.out.println("Ingrese un valor");
                b = scanner.nextInt ();
                repeat = true;
            } catch (InputMismatchException e) {
                System.out.println("Valor no válido");
                System.out.println("Ingrese un valor");
                b = scanner.nextInt ();
                repeat = true;
            }    
        } while (repeat);
        return result;
    }
}
