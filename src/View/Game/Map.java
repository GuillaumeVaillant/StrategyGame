package View.Game;

public class Map {
	
	public Map () {}
	
	public void afficheSeparateur(int n)
	{
		for (int i = 0; i < n; i++)
		{
			System.out.print(("+---"));
		}
		System.out.println("+");
	}
	
	public void afficheTab(int tab[][])
	{	   
		for (int i = 0; i < tab.length ; i++)
		{
			afficheSeparateur(tab.length - 1);
			
		    for (int j = 0; j < tab.length -1; j++)
		    {
		    	System.out.print(String.format("| %2d", tab[i][j]));
		    }
		    
		    System.out.println("|");
		}
		
		afficheSeparateur(tab.length-1);
	}
	
	public void toString(int tab[][]) {
		afficheTab(tab);
	}
	
		 
}
