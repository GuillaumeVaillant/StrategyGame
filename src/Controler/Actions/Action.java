package Controler.Actions;

import Controler.Game.Player;

public abstract class Action {
	
	//Coût en ressource d'utilisation d'une action
	protected int cost;
	protected String description;
	
	public Action (String description)
	{
		this.description = description;
	}
	
	public abstract void execute(Player player);
	
	//Renvoi vrai s'il est possible d'executer une action sur le joueur
	public abstract boolean isPossible(Player player);
}
