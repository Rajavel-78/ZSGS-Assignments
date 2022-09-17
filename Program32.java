import java.util.Scanner;
class Program32{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("This progrtam is check number is positive or negative");
		System.out.println("Enter your number");
		int number=scan.nextInt();
		if(0<number)
		{
			System.out.println("this number is "+number+" Positive");
		}
		else
		{
			System.out.println("this number is "+number+" negative");
     	}
	}
}