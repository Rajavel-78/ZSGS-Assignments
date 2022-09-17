import java.util.Scanner;
class Program30{
   public static void main(String[] args) {
   	 Scanner scan=new Scanner(System.in);
   	 System.out.println("This Program Is largest number of Among three number");
   	 System.out.println("Enter the first number");
   	 int number1=scan.nextInt();
   	 System.out.println("Enter the Second number");
   	 int number2=scan.nextInt();
   	 System.out.println("Enter the  third number");
   	 int number3=scan.nextInt();
   	 if(number1>number2&&number1>number3){
   	 	System.out.println(number1 +" is largest Number");
   	 }else if(number2>number3&&number2>number1){
   	 	System.out.println(number2 +" is largest Number");
   	 }else{
        System.out.println(number3 +" is largest Number");
   	 }

   }
}