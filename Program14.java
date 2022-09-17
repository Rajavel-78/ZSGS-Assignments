import java.util.Scanner;
class Program14{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("this program is area of rectangle");
		System.out.println("enter the length of rectangle");
		int length=scan.nextInt();
		System.out.println("enter the breath of rectangle");
		int breath=scan.nextInt();
		int area=length*breath;
		int premeter=2*(length+breath);
		System.out.println("output Area of rectangle "+ area);
		System.out.println("output premeter of rectangle "+premeter);
	}
}