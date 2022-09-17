import java.util.Scanner;
class Program48{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("This program is number pattern in reverse");
		System.out.println("ENter your input");
		int number=scan.nextInt();
		for(int i=number;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("  ");
			}
			for(int k=i;k<number;k++){
				System.out.print(k+" ");
			}
			for(int l=number;l>=i;l--){
               System.out.print(l+" ");
			}System.out.println();
		}
		
	}
}