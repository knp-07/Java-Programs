import java.util.*;
public class Reverse_a_number {
    public static void main(String[] args){

/*To reverse a number you need to perform 3 operations and those are: 
  1. Get the remainder by dividing the number by 10 i.e use the '%' oprator
  2. Then create a variable with value zero and multiply it by 10 and add the remainder.
  3. The value of the variable will be updated after each loop.
  4. Then divide the number by 10 as the last step and keep repeting the same till number becomes zero.
  5. Lastly print the variable*/
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number that you wish to reverse: ");
        int number = sc.nextInt();
        int remainder, reverse = 0;
        while(number != 0){

            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number /10;
        }
        System.out.println(reverse);
    }
}
