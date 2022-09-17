import java.util.Scanner;
class Program59{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("This program is to print string1 to String2 ");
		String input1=scan.next();
		String input2=scan.next();
		System.out.println(input1.indexOf(input2));

	}
}