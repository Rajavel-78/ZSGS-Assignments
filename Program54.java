import java.util.*;
class Program54{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("This Program is to print the add position inascending order and evn position is dexcending order");
	    System.out.println("How maney Elements in Array");
	    int count=scan.nextInt();
	    ArrayList<Integer>arr=new ArrayList<Integer>();
	    for(int i=0;i<count;i++){
	    	System.out.println("Enter your "+(i+1)+"Element");
           arr.add(scan.nextInt());
	    }
	    ArrayList<Integer>arr_odd=new ArrayList<Integer>();
        ArrayList<Integer>arr_even=new ArrayList<Integer>();
        for(int i=0;i<arr.size();i++){
        	if(i%2==0){
               arr_odd.add(arr.get(i));
        	}
        	else{
        		arr_even.add(arr.get(i));
        	}
        }Collections.sort(arr_odd,Collections.reverseOrder());
         Collections.sort(arr_even);
        System.out.println(arr);    
        System.out.println(arr_odd);    
        System.out.println(arr_even);
        ArrayList<Integer>arr1=new ArrayList<Integer>();
        int odd=0;
        int even=0;
        boolean a=true;
        for(int i=0;i<arr.size();i++){
          if(a){
             arr1.add(arr_odd.get(odd));
             odd++;
             a=false;
          }else{
          	arr1.add(arr_even.get(even));
          	even++;
          	a=true;
          }
        }    
           System.out.println(arr1);

	}
}