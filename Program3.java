import java.util.Scanner;
class Program3{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("THIS PROGRAM IS USER TO GIVEN INPUT AND TO REVERSE INPUT AND SUBTARACTION IN INPUT - REVERASSE INPUT");
		System.out.println("ENTER YOUR NUMBER");
        int input=scan.nextInt();
        int input1=input;
        int module=0;
        int reverseInput=0;
        while(input1>0){
        	module=input1%10;
        	reverseInput=(reverseInput*10)+module;
        	input1=input1/10;
        } 
            System.out.println(reverseInput);
            System.out.println(input-reverseInput);
	}
}