import java.util.Scanner;
class Program60{
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    System.out.println("this program is to print sum of series");
    System.out.println("Enter your input");
    int input=scan.nextInt();
    String sum="";
    String series="";
    for(int i=1;i<=input;i++){
    	sum+=i;
    	for(int j=1;j<=i;j++){
    		series+="1";
    	}
    	if(i!=input)
    	{
    	series+=" + ";
        }
    }
     System.out.println(sum);
     System.out.println(series);
   }
}