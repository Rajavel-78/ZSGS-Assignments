import java.util.Scanner;
class Program17{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("This program is two consentric circle area");
		System.out.println("outSide circle radius");
		int radius_oudside=scan.nextInt();
		System.out.println("inSide circle radius");
		int radius_inside=scan.nextInt();
		int circle1_radius=(int)3.14*radius_oudside*radius_oudside;
		int circle2_radius=(int)3.14*radius_inside*radius_inside;
        System.out.println("space between the two consentric circle "+(circle1_radius-circle2_radius));
	}
}