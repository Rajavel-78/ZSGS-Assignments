import java.util.Scanner;
class Program5{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("This program is pattern based alphabet");
		System.out.println("ENTER YOUR INPUT");
		char input=scan.next().charAt(0);
		for(int i=(int)input;i>=65;i--){
			for(int j=i;j>=65;j--){
               System.out.print((char)i);
			}System.out.println();
		}
	}
}