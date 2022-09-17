import java.util.*;
class Program42{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer>arr=new ArrayList<Integer>();
		System.out.println("This program is frequency of array");
		System.out.println("how maney element in array");
		int count=scan.nextInt();
		for(int i=0;i<count;i++){
			System.out.println("Enter the "+(i+1)+"elements");
			arr.add(scan.nextInt());
		}
		HashSet<Integer>arr1=new HashSet<Integer>(arr);
		for(Integer m:arr1){
		System.out.println(m+" "+Collections.frequency(arr,m));
		}
        
	}
}