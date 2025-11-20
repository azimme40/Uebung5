package h1;

public class H1_main {
	public static void main(String[] args) 
	{
	int[] myArray = {1, 10, 6, 4, 5};
	int b = myArray.length-1; 
	int [] hilfsarray = new int [myArray.length];
	
	for (int i = 0; i< myArray.length; i++)
	{
		hilfsarray[i] = myArray[b];
		System.out.println (hilfsarray [i]);
		b=b-1;
		
	}
	
	
	myArray =hilfsarray;
	}

}
