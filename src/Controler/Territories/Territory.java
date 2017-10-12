package Controler.Territories;

import java.util.List;

import Controler.Game.Player;
import Controler.Objects.Army;
import Controler.Objects.City;

public abstract class Territory {
	
	protected City city;
	protected List<Army> listArmy;
	protected String description;
	
	public Territory(String description)
	{
		this.description = description;
	}
	
	//Retourne le joueur à qui appartient le térritoire
	public Player getOwner()
	{
		return null;
	}
	
	//Activer l'effet du territoire ?
	protected abstract void getEffect();
	

}
