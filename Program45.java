import java.util.Scanner;
class Program45{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("This program is Sum of all element in Array");
		System.out.println("How maney element in Array");
	    int count=scan.nextInt();
	    int[] array=new int[count];
	    for(int i=0;i<count;i++){
	    	System.out.println("Enter the "+(i+1)+"Element");
	    	array[i]=scan.nextInt();
	    }
	    System.out.println("Sum of array");
	    int sum_ofArray=0;
	    for(int i=0;i<array.length;i++){
           sum_ofArray+=array[i];
	    }
	    System.out.println(sum_ofArray);
	}
}