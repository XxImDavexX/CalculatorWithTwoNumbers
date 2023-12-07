package test;

import java.util.Scanner;

public class CalculatorWithTwoNummbers {
    public static void main(String[] args) {
        int number1, number2;
        double total = 0;
        String operationalSign;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert the first number:"); 
        number1 = keyboard.nextInt();
        System.out.println("Insert the second number:");
        number2 = keyboard.nextInt();
        System.out.println("Select de operation:  + | - | * | / | ^ | % ");
        operationalSign = keyboard.next();
        
        switch(operationalSign){
            case "+":
                
                total = number1 + number2;
                
            break;
            
            case "-":
                
                total = number1 - number2;
                
            break;
            
            case "*":
                
                total = number1 * number2;
                
            break;
            
            case "/":
                
                total = number1 / number2;
                
            break;
            
            case "^":
                
                total = Math.pow(number1, number2);
                
            break;
            
            case "%":
                
                total = number1 % number2;
                
            break;

            default:
                System.out.println("This is not a operational sign!!!");

        }
        
        System.out.println(number1 + " " + operationalSign + " " + number2 + " = " + total);
    }
}
