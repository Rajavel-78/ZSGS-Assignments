import java.util.Scanner;
class Program35{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	System.out.println("THis program is to given input and factorials & sum of digits");
	System.out.println("enter your input");
	int input=scan.nextInt();
	int fact=1;
	int fact_DigitSum=0;
    for(int i=input;i>0;i--){
         fact*=i;
         fact_DigitSum+=i;
    }
    System.out.println("factorials of given input"+input+" "+fact);
    System.out.println("sum of digit in inputs "+input+" "+fact_DigitSum);
	}
}