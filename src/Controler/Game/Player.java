package Controler.Game;

import java.util.ArrayList;
import java.util.List;

import Controler.Actions.Action;
import Controler.Objects.Army;
import Controler.Objects.City;
import Controler.Territories.Territory;

public class Player {
	
	private String name;
	private int ressources;
	private boolean isAlive;
	private boolean turn;
	private List<Territory> listTerritory;
	private List<Army> listArmy;
	private List<City> listCity;
	private List<Action> listActions;
	
	public Player(String name, int ressources)
	{
		this.name = name;
		this.ressources = ressources;
		this.isAlive = true;
		this.turn = false;
		this.listTerritory = new ArrayList<Territory>();
		this.listArmy = new ArrayList<Army>();
		this.listCity = new ArrayList<City>();
		this.listActions = new ArrayList<Action>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRessources() {
		return ressources;
	}

	public void setRessources(int ressources) {
		this.ressources = ressources;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public boolean isTurn() {
		return turn;
	}

	public void setTurn(boolean turn) {
		this.turn = turn;
	}

	public List<Territory> getListTerritory() {
		return listTerritory;
	}

	public void setListTerritory(List<Territory> listTerritory) {
		this.listTerritory = listTerritory;
	}

	public List<Army> getListArmy() {
		return listArmy;
	}

	public void setListArmy(List<Army> listArmy) {
		this.listArmy = listArmy;
	}

	public List<City> getListCity() {
		return listCity;
	}

	public void setListCity(List<City> listCity) {
		this.listCity = listCity;
	}

	public List<Action> getListActions() {
		return listActions;
	}

	public void setListActions(List<Action> listActions) {
		this.listActions = listActions;
	}
	
}
