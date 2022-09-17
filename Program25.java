import java.util.Scanner;
class Program25{
	public static void main(String[] args) {
     	Scanner scan=new Scanner(System.in);
		System.out.println("This program is to given input of divident and diviser and output is reminder and Quotient");
		System.out.println("Enter the divident");
		int divident=scan.nextInt();
		System.out.println("Enter the diviser");
		int diviser=scan.nextInt();
		System.out.println("Quotient "+divident+" / "+diviser+" = "+(divident/diviser));
        System.out.println("reminder "+divident+" % "+diviser+" = "+(divident%diviser));



	}
}