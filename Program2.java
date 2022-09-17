import java.util.Scanner;
class Program2{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER YOUR INPUT ONELY CHARACTER");
		char input=scan.next().charAt(0);
        char input_tOUpperCase=Character.toUpperCase(input);
		for(char i=input_tOUpperCase;i<='Z';i++){
			System.out.println(" "+i);
		}
	}
}