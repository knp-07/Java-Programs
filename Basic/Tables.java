import java.lang.*;
import java.util.*;
public class Tables {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int t = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            int result = t * i;
            System.out.println(t + " * "+ i + " = " +result);
        }
    }
}
