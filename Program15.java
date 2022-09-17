import java.util.Scanner;
class Program15{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("This program is area of a cylinder");
        System.out.println("Enter the height of cylinder");
		int height=scan.nextInt();
		System.out.println("Enter the radius of cylinder");
		int radius=scan.nextInt();
		System.out.println("area of cylinder "+(2*3.14*radius*(radius+height)));

	}
}