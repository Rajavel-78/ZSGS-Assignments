import java.util.Scanner;
class Program7{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("this program is The Length of the input to print x pattern example input (12345)");
		System.out.println("Enter Your Input");
		String input=scan.nextLine();
		if(input.length()%2==0){
			System.out.println("enter the length is odd onely");

		}else{
			for(int i=1;i<=input.length();i++){
			  for(int j=1;j<=input.length();j++){
			  	if(i==j||j==(input.length()-i)+1){
			  		System.out.print(i);
			  	}else{
			  		System.out.print(" ");
			  	}
			  }System.out.println();
			
			}
		}
        
    }
}