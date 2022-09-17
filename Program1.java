import java.util.Scanner;
class Program1{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Number");
	    int input=scan.nextInt();
	    System.out.println("-----MULTIPLICATION TABLE-------");
	    for (int i=1;i<10;i++) {
	    	System.out.println(i+" X "+ input + " = "+ (i*input));
	    }
	    System.out.println("-----SUBTRACTION  TABLE------");
	    for (int i=1;i<10;i++) {
	    	System.out.println(i+" - "+ input + " = "+ (i-input));
	    }System.out.println("-------------------------");
	}
}