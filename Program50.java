import java.util.Scanner;
class Program50{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("this program is reverse number pyramid pattern");
		System.out.println("Enter your input number onely");
        int input=scan.nextInt();
		for(int i=0;i<input;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}for(int k=0;k<input-i;k++){
				System.out.print((input-i)+"  ");
			}System.out.println();
		}
	}
}