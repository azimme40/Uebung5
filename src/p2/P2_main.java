package p2;

public class P2_main {
	public static void main(String[] args) 
	{
		int max= 0; 
		int minIndex= 0; 
		int [] numbers = {1 , 2 , 3 , 4}; 
		
		
		
		for (int i= numbers.length; i>= 0; i--)
		{
			max = numbers [i];
			minIndex = numbers[max];
			
		}
		System.out.println(max);
		System.out.println(minIndex);
		
		
	}

}
