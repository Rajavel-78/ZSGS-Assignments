import java.util.*;
class Program9
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);

		System.out.println("This program is two arrys merged in not duplicate values");
		System.out.println("number of element insert in 1 st array");
		int elementsIn_1stArray=scan.nextInt();
		int[] array1=new int[elementsIn_1stArray];
		for(int i=0;i<elementsIn_1stArray;i++)
		{
			System.out.println("Enter the "+(i+1)+"elements");
			array1[i]=scan.nextInt();
		}
		ArrayList<Integer>merged_Array=new ArrayList<Integer>();
			for(int i=0;i<elementsIn_1stArray;i++)
			{
               merged_Array.add(array1[i]);
			}
		System.out.println("number of element insert in 2 nd array");	
		int elementsIn_2ndArray=scan.nextInt();
		int[] array2=new int[elementsIn_2ndArray];
		for(int i=0;i<elementsIn_2ndArray;i++)
		{
			System.out.println("Enter the "+(i+1)+"elements");
			array2[i]=scan.nextInt();
		}
		for(int i=0;i<elementsIn_2ndArray;i++)
			{
               merged_Array.add(array2[i]);
			}
        Collections.sort(merged_Array);
        LinkedHashSet<Integer>arr=new LinkedHashSet<Integer>(merged_Array);
        System.out.println("Output "+arr);
	}

}