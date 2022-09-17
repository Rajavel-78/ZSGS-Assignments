import java.util.Scanner;
class Program28{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("This Program is given input is Add or even");
		System.out.println("Enter your input");
		int input=scan.nextInt();
		System.out.println("This Number is "+input);	
		System.out.println(input%2==0?" Even":" Odd");
	}
}