import java.util.*;
class Program52{
	public static void reverse(ArrayList<String> array){
		
		if(array.size()==0){
          

		}else{
			System.out.print(array.get(array.size()-1)+" ");
			array.remove(array.size()-1);
			reverse(array);
		}

	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("this program is recursion in reverse words");
        System.out.println("Enter your input");
        String input=scan.nextLine();
        String[] inputSplit=input.split(" ");
        ArrayList<String>arr=new ArrayList<String>();
        for(int i=0;i<inputSplit.length;i++){
        	arr.add(inputSplit[i]);
        }
        reverse(arr); 
	}
}