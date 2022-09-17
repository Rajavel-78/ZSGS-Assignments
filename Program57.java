import java.util.Scanner;
class Program57{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("THis Program is X pattern Print");
		System.out.println("Enter your input");
		String input=scan.nextLine();
		for(int i=1;i<=input.length();i++){
			for(int j=1;j<=input.length();j++){
				if(i==j||j==(input.length()-i+1)){
					System.out.print(j);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}