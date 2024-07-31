import java.util.Scanner;

public class Star_Pattern_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stars you want to print in the last and the first row: ");
        int number = sc.nextInt();
        System.out.println("Pattern 1: ");
        for(int i = 1; i <= number; i++){
            for(int j = 1 ;j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("Pattern 2: ");
        for(int i = 1; i <= number; i++){
            for(int j = number ;j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
