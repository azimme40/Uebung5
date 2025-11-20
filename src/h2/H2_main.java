package h2;

public class H2_main {

	public static void main(String[] args) 
	{
		int n= 67; 
		int digits =0;
		int [] a = {0, 0, 0, 0, 0, 0, 0, 0, 0};

		
		digits = String.valueOf(n).length();
		digits= 0; 
		int start= 9 - digits; 
		start= 9-digits; 
		
		for (int i = 0;i < start; i++)
		{
			a[i]= 0;   
			System.out.println(a[i]);
		}
		
		 for (int i = 8; i>= start; i--)
		 {
			
			 a[i]= n % 10; 
			 n = n/10; 
		 }
		 for (int k = start; k< 9; k++)
		 {
			 
		 System.out.println (a[k]);
		 
		 }
	 }

		
		

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		//for (int i = 0; )
		
		//for (int k = 7; k>= start; k++)
		//{
		//	a[k]= n % 10; 
		//	n/=10;
		//	System.out.println (a [k]);
		//}
		
		
		
		
			//for (int i= 9-1; i>= 0; i--)
			//{
			//	a[i]= n % 10;
			//	n/= 10; 
			//	System.out.println (a);
			//}
			
		
			
	
		
			//for (int i = 0;i<9-digits;i++ )
			//{
				//a[i]= 0;
				//System.out.println (a [i]);
			
			}
			//for (int k= 0;k < 9-digits; k++ )
			//{
				//a [8-k] = n % 10; 
			//	System.out.println (a [8-k]);
			//}
		
		
	
	


