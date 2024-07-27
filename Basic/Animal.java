class Animal {
     String color;
     int age;
         public void information(String c , int a){
             color = c;
             age = a;
         }

         public void aboutAnimal(){
             System.out.println(color +" "+ age);
         }
     public static void main(String[] args){
         Animal shiro = new Animal();
         shiro.information("white",8);
         shiro.aboutAnimal();
     }
}
