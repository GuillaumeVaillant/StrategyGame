package Controler.Game;

import java.util.ArrayList;
import java.util.List;

import Controler.Territories.Field;
import Controler.Territories.Mountain;
import Controler.Territories.Plains;
import Controler.Territories.Territory;

public class Map {
	
	private List<Territory> allTerritory;
	
	public Map()
	{
		this.allTerritory = new ArrayList<Territory>();
		initMap();
	}
	
	public void initMap()
	{
		//randoom 
		this.allTerritory.add(new Mountain());
		this.allTerritory.add(new Plains());
		this.allTerritory.add(new Field());
		this.allTerritory.add(new Mountain());
		this.allTerritory.add(new Plains());
		this.allTerritory.add(new Field());
		this.allTerritory.add(new Mountain());
		this.allTerritory.add(new Plains());
		this.allTerritory.add(new Field());
		
		Model.Game.Map.ChangeState(allTerritory);
	}

}
