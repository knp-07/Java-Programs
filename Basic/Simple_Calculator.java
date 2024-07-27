import java.util.*;

public class Simple_Calculator {
    public static void main(String[] args){
        //Simple Calculator using switch statements;
        String yn;

        //Thought of using a do-while loop so as to not re-run the program again and again, that would be insanity :)
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
            //converting to uppercase so as to not make it case sensitive.
            yn = sc.next().toUpperCase();

        }while (yn.equals("YES"));
    }
}
