import java.util.Scanner;
class Program24{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("This Program is to input character and output is Ascii value");
		System.out.println("Enter the Input onely the Character");
		char input=scan.next().charAt(0);
		System.out.println(input+" ASCII value "+(int)input);
	}
}