public class Prime_Numbers_2 {
    public static void main(String[] args){
        //print prime numbers from 1 to 100;
            int temp = 0;
        for(int i = 1; i < 100; i++){
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    temp = temp + 1;
                }

            }if(temp == 0){
                System.out.print(i + "  ");
            }else {
                temp = 0;
            }
        }
    }
}
