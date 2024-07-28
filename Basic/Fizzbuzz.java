import java.lang.*;
import java.util.*;

/* 
For each multiple of 3, print "Fizz" instead of the number. 

For each multiple of 5, print "Buzz" instead of the number. 

For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
*/


public class Fizzbuzz {

    public int FizzBuzz(int num){
        for(int i = 1; i < num; i++){
            if(i % 3 == 0 && i %5 == 0){
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i %  5== 0) {
                System.out.print("Buzz ");
            }else {
                System.out.print(i + " ");
            }
        }return num;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Fizzbuzz x = new Fizzbuzz();
        System.out.println(x.FizzBuzz(27));
    }
}
