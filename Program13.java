import java.util.Scanner;
class Program13{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("this program is area of squre");
		System.out.println("enter the length of squre");
		int length=scan.nextInt();
		int area=length*length;
		int premeter=4*length;
		System.out.println("output Area of squre "+ area);
		System.out.println("output premeter of squre "+premeter);
	}
}