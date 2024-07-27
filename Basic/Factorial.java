import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        int answer = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int factorial = sc.nextInt();
        for (int i = 1; i <= factorial; i++){
            answer = answer * i;
        }
        System.out.print("The factorial of " + factorial + " is: ")
        System.out.print(answer);
    }
}
