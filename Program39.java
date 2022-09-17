import java.util.Scanner;
class Program39{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("this program is Array smallest position");
		System.out.println("how maey element in Array");
		int count=scan.nextInt();
		int[] array=new int[count];
		for(int i=0;i<count;i++){
			System.out.println("Enter the "+(i+1)+"elements");
			array[i]=scan.nextInt();
		}
		int num1=array[0];
		for(int i=1;i<array.length;i++){
			if(array[i]<num1){
				num1=array[i];
			}
		}System.out.println("The smallest elmment is in array is "+num1);
	}
}