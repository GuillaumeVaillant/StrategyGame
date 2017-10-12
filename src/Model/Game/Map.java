package Model.Game;

import java.util.List;

import Controler.Territories.Territory;

public class Map {
	
	public static String tab[][] = {
		    {  "0",  "0",  "0",  "0" },
		    {  "0",  "0",  "0",  "0" },
		    {  "0",  "0",  "0",  "0" },
		    {  "0",  "0",  "0",  "0" },
		    {  "0",  "0",  "0",  "0" }
	};

	public static void ChangeState(List<Territory> allTerritory) {
		int taille = allTerritory.size();
		
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++) {
				switch (allTerritory.get(taille--).toString()) 
				{
				case "1":
					tab[i][j] = "1";
					break;
				case "2":
					tab[i][j] = "2";
					break;
				case "3":
					tab[i][j] = "3";
					break;
				default:
					tab[i][j] = "0";
					break;
				}
			}
		}
		
	}

}
