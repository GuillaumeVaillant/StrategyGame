package Controler.Menu;

public class MenuSetting {

	private int type;
	private int nbTurn;
	private int size;
	private int maxPlayer;
	private int ressources;
	private int nbResourcesPerTurn;
	
	public MenuSetting(int type, int nbTurn, int size, int maxPlayer, int ressources, int nbResourcesPerTurn) {
		super();
		this.type = type;
		this.nbTurn = nbTurn;
		this.size = size;
		this.maxPlayer = maxPlayer;
		this.ressources = ressources;
		this.nbResourcesPerTurn = nbResourcesPerTurn;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getNbTurn() {
		return nbTurn;
	}

	public void setNbTurn(int nbTurn) {
		this.nbTurn = nbTurn;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getMaxPlayer() {
		return maxPlayer;
	}

	public void setMaxPlayer(int maxPlayer) {
		this.maxPlayer = maxPlayer;
	}

	public int getRessources() {
		return ressources;
	}

	public void setRessources(int ressources) {
		this.ressources = ressources;
	}

	public int getNbResourcesPerTurn() {
		return nbResourcesPerTurn;
	}

	public void setNbResourcesPerTurn(int nbResourcesPerTurn) {
		this.nbResourcesPerTurn = nbResourcesPerTurn;
	}
	
	
}
