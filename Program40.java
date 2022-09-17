import java.util.Scanner;
class Program40{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("this program how maney element presant in array");
		System.out.println("how maey element in Array");
		int count=scan.nextInt();
		int[] array=new int[count];
		for(int i=0;i<count;i++){
			System.out.println("Enter the "+(i+1)+"elements");
			array[i]=scan.nextInt();
		}
		int elements=0;
		for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
            elements++;
		}System.out.println(elements+" element presant in array");
	}
}