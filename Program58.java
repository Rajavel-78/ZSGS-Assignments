import java.util.Scanner;
class Program58{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("This program is print the inside diamand pattern");
		System.out.println("Enter your input");
		int input=scan.nextInt();
		for(int i=0;i<input;i++){
			for(int j=0;j<input-i;j++){
				System.out.print("*");
			}
			for(int k=0;k<i;k++){
				System.out.print("_");
			}
			for(int m=i;m>0;m--){
				System.out.print("_");
			}
			for(int l=input-i;l>0;l--){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=input-1;i++){
         for(int l=0;l<i+1;l++){
         	System.out.print("*");
         }for(int m=input-i;m>1;m--){
         	System.out.print("_");
         }for(int k=input-i;k>1;k--){
         	System.out.print("_");
         }for(int j=0;j<i+1;j++){
         	System.out.print("*");
         }

         System.out.println();
		}
	}
}