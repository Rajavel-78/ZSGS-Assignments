import java.util.Scanner;
class Program56{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("This program is print the pyrmaid patter in number");
		System.out.println("Enter your input");
		int input=scan.nextInt();
		int count=0;
		 int num=1;
		for(int i=1;i<=input/2;i++){
			 if(num<input){
			 	for(int j=0;j<input/2-i;j++){
			 		System.out.print(" ");
			 	}
			 	for(int k=1;k<=i;k++){
			 		System.out.print(num+" ");
			 		num++;
			 	}System.out.println();
			 }
			}


	}
}