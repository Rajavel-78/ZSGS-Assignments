import java.util.*;
class Program53{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("This program is to print the input(a1b2) output(abb)");
		String input=scan.nextLine();
		String count="0";
		String a=String.valueOf(input.charAt(0));
		for(int i=0;i<input.length();i++){
           if(Character.isLetter(input.charAt(i))){
           for(int j=0;j<Integer.parseInt(count);j++){
                	System.out.print(a);
                }
               a=String.valueOf(input.charAt(i));
               count="0"; 
           }
           else{
             count=String.valueOf(input.charAt(i));   	 
               if(i==input.length()-1){
               	for(int j=0;j<Integer.parseInt(count);j++){
                	System.out.print(a);
                }
               }
           	 
           }
		}

	}
}