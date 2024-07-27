public class Static_count {

    static int count = 0;
    Static_count(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args){
        Static_count emp1 = new Static_count();
        Static_count emp2 = new Static_count();
        Static_count emp3 = new Static_count();

    }
}
