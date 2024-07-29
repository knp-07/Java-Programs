import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int remainder, reverse = 0;
        while(temp != 0){

            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp /10;
        }

        if( number == reverse){
            System.out.println(" Number is a Palindrome ");
        }else {
            System.out.println("Number is not a Palindrome ");
        }
    }
}
