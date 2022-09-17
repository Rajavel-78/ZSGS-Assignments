import java.util.Scanner;
class Program29{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("This Program Is check a character vowels or consonant");
	    System.out.println("enter your input");
	    char ch=scan.next().charAt(0);
	    String input_ch=String.valueOf(Character.toUpperCase(ch));
	    if(input_ch.equals("E")||input_ch.equals("A")||input_ch.equals("I")||input_ch.equals("O")||input_ch.equals("U")){
          System.out.println("This character is "+ch+" vowels");
	    }else{
	    	System.out.println("This character is "+ch+" consonant");
	    }

	}
}