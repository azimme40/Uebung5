package h3;

public class H3_main {
	
	public static void main(String[] args) 
	{
		int [][] einheiten= 
			{
					{50000,20000,10000,5000,2000,1000,500,200,100,50,20,10,5,2,1 },
					{0,    0,    0,    0,   0,   0,   0,  0,  0,  0,  0, 0,0,0,0},
			
					
			};
		int input= 56808; 
		
		System.out.println("der Betrag ist: " + input + "Cent");
		
		for (int i= 0; i< 15; i++)
		{
			int teiler = einheiten [0][i];
			int anzahl = input / teiler; 
			einheiten[1][i]= anzahl; 
			input = input% teiler; 
				
		}
		
		for (int i= 0; i< 15; i++)
		{
			if (einheiten[1][i]>0)
			{
		     System.out.println( einheiten[1][i]+"x mal: "+ einheiten [0][i]);
			}
		}
		
		
	}
}
