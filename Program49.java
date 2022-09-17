import java.util.Scanner;
class Program49{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("This program is to print reverse pyramid");
		System.out.println("Enter your input number onely");
		int number =scan.nextInt();
		for(int i=0;i<number;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<number-i;k++){
              System.out.print(" * ");
			}System.out.println();
		}
	}
}