import java.util.Scanner;

public class Fibonacci_series {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the series: ");
        int number = sc.nextInt();
        int a = 0;
        int b = 1;
	    int sum;
        System.out.print(a +"  ");
        System.out.print(b + "  ");
        for(int i = 1; i < number -1; i++){
		 sum = a + b;
            System.out.print(sum + "  ");
            a = b;
            b = sum;
   	}
    }
}
