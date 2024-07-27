import java.util.*;
import java.lang.*;
import java.io.*;

public class Simple_Calculator {
    public static void main(String[] args){
        //Simple Calculator using switch statements;
        String yn;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int firstNumber = sc.nextInt();
            System.out.print("Enter the second number: ");
            int secondNumber = sc.nextInt();
            System.out.print("Select a valid operator from the following options (+, -, *, / ) ");
            String symbol = sc.next();
            int result;
            switch (symbol){

                case "+" : result = firstNumber + secondNumber;
                    System.out.println(result);
                    break;

                case "-" : result = firstNumber - secondNumber;
                    System.out.println(result);
                    break;

                case "*" : result = firstNumber * secondNumber;
                    System.out.println(result);
                    break;

                case "/" : result = firstNumber / secondNumber;
                    System.out.println(result);
                    break;

                default:
                    System.out.println("Invalid symbol");

            }
            System.out.println("Do you want to continue? Type in Yes or No");
            yn = sc.next().toUpperCase();

        }while (yn.equals("YES"));
    }
}
