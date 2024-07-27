import java.util.*;
public class Reverse_a_number {
    public static void main(String[] args){
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
