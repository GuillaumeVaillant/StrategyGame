package Controler.Game;

import java.util.ArrayList;
import java.util.List;

import Controler.Menu.MenuSetting;

public class Game {
	
	private List<Player> listPlayers;
	private Map map;
	//Etat de la partie
	private boolean state;
	private MenuSetting setting;
	
	public Game(ArrayList<Player> listPlayer, MenuSetting setting) 
	{
		this.listPlayers = listPlayers;
		this.map = new Map();
		this.state = true;
	}
	
	public void start()
	{
		this.listPlayers.get(0).setTurn(true);
	}

	public List<Player> getListPlayers() {
		return listPlayers;
	}

	public void setListPlayers(List<Player> listPlayers) {
		this.listPlayers = listPlayers;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
}
