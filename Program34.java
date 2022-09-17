import java.util.Scanner;
class Program34
{
	public static void main(String[] args)
	 {
		Scanner scan=new Scanner(System.in);
		System.out.println("This program is to print the sum of natural numbers");
		System.out.println("Enter your number");
		int input=scan.nextInt();
        int sum=(input*(input+1)/2);
		System.out.println("sum of natural numbers  "+sum);
		String sumOfNumber=String.valueOf(sum);
		String[] sumSplit=sumOfNumber.split("");
		int highestOf_sum=0;
		for(int i=0;i<sumSplit.length;i++)
		{ 

           if(highestOf_sum<Integer.parseInt(sumSplit[i])){
           	  highestOf_sum=Integer.parseInt(sumSplit[i]);
           }
		} 
		System.out.println("largest digit of "+highestOf_sum);
	}
}