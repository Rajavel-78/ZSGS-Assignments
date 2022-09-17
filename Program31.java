import java.util.Scanner;
class Program31{
	public static void main(String[] args)
	{
        Scanner scan=new Scanner(System.in); 
		System.out.println("THis program is Quadratic equation");
		System.out.println("Enter your input");
		System.out.println("Enter the a value");
		int a=scan.nextInt();
		System.out.println("Enter the b value");
		int b=scan.nextInt();
		System.out.println("Enter the c value");
	    int c=scan.nextInt();
        int x=(int)(Math.pow(b,2)-(4*a*c));
        System.out.println((Math.pow(b,2)-(4*a*c)));
        int y=(int)Math.sqrt(x); 
        if(x>0){
        	System.out.println((-b+x)/2*a);
        	System.out.println((-b-x)/2*a);
        }else if(x<0){
         System.out.println((-b+x)/(2*a));
         System.out.println((-b-x)/(2*a));
        }
        else{
           System.out.println(-b/2*a);
        }
	}
}