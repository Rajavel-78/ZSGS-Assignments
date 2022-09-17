import java.util.*;
class Program11{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<ArrayList>arr=new ArrayList<ArrayList>();
		System.out.println("this Program is Multidimentional array");
        System.out.println("HOW MANEY ARRAY INSERT IN ARRAY");
        int input=scan.nextInt();
        for(int i=0;i<input;i++){
        	arr.add(new ArrayList<Integer>());
        	System.out.println("HOW MANEY element insert in "+(i+1)+" ARRAY");
        	int element_count=scan.nextInt();
        	for(int j=0;j<element_count;j++){
        		System.out.println("Enter the "+(j+1)+" Elements");
        		arr.get(i).add(scan.nextInt());
        	}
        }System.out.println("Orginal array "+arr);
        System.out.println("How maney time rotate in the inner array element");
        int rotateCount=scan.nextInt();
       
        	for(int i=0;i<arr.size();i++)
        		for(int j=0;j<rotateCount;j++){
                     arr.get(i).add(arr.get(i).get(j));
                arr.get(i).remove(arr.get(i).get(arr.get(i).size()-1));
        		}

        System.out.println("Rotational Array "+arr);
	}
}