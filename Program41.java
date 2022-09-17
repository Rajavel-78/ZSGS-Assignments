import java.util.Scanner;
class Program41{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("this program copy to array");
		System.out.println("how maey element in Array");
		int count=scan.nextInt();
		int[] array=new int[count];
		for(int i=0;i<count;i++){
			System.out.println("Enter the "+(i+1)+"elements");
			array[i]=scan.nextInt();
		}
		System.out.println("orginalarray ");
		for(int i=0;i<array.length;i++){
         System.out.print(array[i]+" "); 
        }System.out.println();

        int[] copyarray=new int[array.length];
        for(int i=0;i<array.length;i++){
        	copyarray[i]=array[i];
        }
        System.out.println("copyarray");
        for(int i=0;i<copyarray.length;i++){
         System.out.print(copyarray[i]+" "); 
        }

    }
}