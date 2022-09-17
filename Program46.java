import java.util.*;
class Program46{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer>array=new ArrayList<Integer>();
		System.out.println("This program is right rotation of in Array");
		System.out.println("How maney element in Array");
	    int count=scan.nextInt();
	    for(int i=0;i<count;i++){
	    	System.out.println("Enter the "+(i+1)+"Element");
	    	array.add(scan.nextInt());
	    }

	    System.out.println("how maney times rotation in Array");
	    int rotate_count=scan.nextInt();
	    System.out.println("before rotate in Array : "+array);
	    for(int i=0;i<rotate_count;i++){
	    	array.add(0,array.get(array.size()-1));
	    	array.remove(array.size()-1);
	    }
	    System.out.println("After rotate in Array : "+array);
	}
	
}