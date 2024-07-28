public class Fibonacci_series_2 {

    //In this program we created a method for calculating fibonacci series and called it by creating an objet of the class
        public void getFibo(int number){

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

        public static void main (String[] args){
            //you can enter any number you want.
            Fibonacci_series_2 obj = new Fibonacci_series_2();
            obj.getFibo(10);
        }
    }


