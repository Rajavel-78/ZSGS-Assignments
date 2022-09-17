
import java.util.Scanner;
class Program33{
	public static void main(String[] args) {
		System.out.println("This program is given input is Alphabet or not Alphabet");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input");
		char ch=scan.next().charAt(0);
		if(Character.isAlphabetic(ch)){
			System.out.println("This Character is "+ch+ " Alphabet");
		}else{
			System.out.println("This Character is "+ch+ " not Alphabet");
		}
	}
}