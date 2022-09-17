import java.util.*;
class Program43{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("this program is Array left rotation");
		System.out.println("how maey element in Array");
		int count=scan.nextInt();
		ArrayList<Integer>array=new ArrayList<Integer>();
		for(int i=0;i<count;i++){
			System.out.println("Enter the "+(i+1)+"elements");
			array.add(scan.nextInt());
		}
		System.out.println("before left rotation in array");
		System.out.println(array);
		System.out.println("how maney times rotate in the array");
		int rotate_count=scan.nextInt();
		for(int i=0;i<rotate_count;i++){
             array.add(array.get(0));
             array.remove(0);
		}
		System.out.println("After left rotation in array");
		System.out.println(array);
	}

}