import java.util.*;
class Program10{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("how maney element insert in the array");
		int elements_OfArray=scan.nextInt();
		int[] array=new int[elements_OfArray];
        for(int i=0;i<elements_OfArray;i++){
        	System.out.println("Enter the "+(i+1)+" elements");
        	array[i]=scan.nextInt();
        }int temp=0;
        for(int i=0;i<array.length;i++){
        	for(int j=1;j<array.length-i;j++){
            	if(array[j-1]>array[j]){
            		temp=array[j-1];
            		array[j-1]=array[i];
            		array[j]=temp;
            		
            	}
        	}
        }int[] array1=new int[array.length]; 
         int last=array.length-1;
         int first=0;
        boolean isValid=true;
        for(int i=0;i<array.length;i++){
          if(isValid){
              array1[i]=array[last--];
              isValid=false;
          }else{
          	array1[i]=array[first++];
          	isValid=true;
          }
        }	
        for(int i:array1){
        	System.out.print(i+" ");
        }

	}
}