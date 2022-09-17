import java.util.Scanner;
class Program6{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("to given input of some student and Split the 4 class");
        int input=scan.nextInt();
        String group1="";
        String group2="";
        String group3="";
        String group4="";
        for(int i=101;i<=100+input;i++){
          group1+=(i++)+"\n";
          group2+=(i++)+"\n";
          group3+=(i++)+"\n";
          group4+=(i++)+"\n";
          i--;
        } System.out.print("Output:\n"+"  group 1:\n"+group1+"  group 2:\n"+group2+"  group 3:\n"+group3+"  group 4:"+group4);
	}
}