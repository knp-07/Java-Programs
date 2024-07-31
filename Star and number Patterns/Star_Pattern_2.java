import java.util.Scanner;

public class Star_Pattern_2 {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stars in the middle row: ");
        int number = sc.nextInt();
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1;i <= number; i++ ){
            for(int j = number - 1 ; j >= i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
