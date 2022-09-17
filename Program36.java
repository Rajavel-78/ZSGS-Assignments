import java.util.Scanner;
class Program36{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("this program is Array even position");
		System.out.println("how maey element in Array");
		int count=scan.nextInt();
		int[] array=new int[count];
		for(int i=0;i<count;i++){
			System.out.println("Enter the "+(i+1)+"elements");
			array[i]=scan.nextInt();
		} 
        for(int i=0;i<array.length;i++){
        	if(i%2==1){
        		System.out.print(array[i]+" ");
        	}
        }
	}
}