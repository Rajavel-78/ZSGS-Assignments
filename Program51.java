import java.util.Scanner;
class Program51{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("This Program is given number to reverse");
		System.out.println("Enter your input");
		int input=scan.nextInt();
		int module=0;
		int reverse=0;
		while(input>0){
			module=input%10;
			reverse=reverse*10+module;
			input=input/10;
		}System.out.println("reverse number :"+reverse);

	}
}