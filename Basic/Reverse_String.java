import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        int length = input.length();
        String reverse ="";
        for(int i = length - 1; i >= 0; i--){
        reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);
    }
}
