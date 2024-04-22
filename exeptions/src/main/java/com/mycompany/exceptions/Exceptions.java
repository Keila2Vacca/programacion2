package com.mycompany.exceptions;

public class Exceptions {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.division(2, 0);
        
       /* 
        try{
            int result = calculator.division(4, 0);
            System.out.println(result);
        } catch(Exception exception) {
            System.out.println("Ha ocurrido un problema");
            System.out.println(exception);
            //int result = 2/0;
        } finally{ //se ejecuta siempre sin importar la excepción
            System.out.println("bloque para imprimir siempre");
        }
        */
       /*
        try{
            int[] numbers = new int[3];
            numbers[5] = 2/0;
        } catch (ArithmeticException e){
            System.out.println("Operación no permitida"); 
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posición de array no válida");
        } catch (Exception e){
            System.out.println("Ha ocurrido un problema");
        }
        */  
    }
}
