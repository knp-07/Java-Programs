import java.util.*;
import java.lang.*;
public class Prime_Numbers {
    //check if a number is prime or not
    public static void main(String[] args){
        String yn;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number that you want to check: ");
            int number = sc.nextInt();
            int temp = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    temp = temp + 1;
                }
            }
            if (temp > 0) {
                System.out.println("Number is not prime");
            } else {
                System.out.println("Number is prime");
            }
            System.out.println("Type is YES to rerun or press any other key to continue: ");
            yn = sc.next().toUpperCase();
        }while(yn.equals("YES"));
   }
}
