import java.util.Scanner;
class Program55{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("This program is print the C pattern");
		System.out.println("Enter your input");
		int input=scan.nextInt();
		for(int j=1;j<=input;j++){
			if(j==1||j==input){
				for(int i=1;i<=input;i++){
					System.out.print("*");
				}
			}
				else{
                 System.out.print("*");
   				}
   				System.out.println("");
	   	}
	}
}