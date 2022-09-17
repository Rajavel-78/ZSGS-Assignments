import java.util.Scanner;
class Program27{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("this program is Swap to number");
		System.out.println("enter the first number");
		int number1=scan.nextInt();
		System.out.println("enter the second number");
		int number2=scan.nextInt();
		System.out.println("before swaping the number is "+" number1 "+number1+" number2 "+ number2);
		number1=number2+number1;
		number2=number1-number2;
		number1=number1-number2;
	System.out.println("after swaping the number is "+" number1 "+number1+" number2 "+ number2);
	}
}