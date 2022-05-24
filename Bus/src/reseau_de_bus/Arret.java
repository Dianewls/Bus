package reseau_de_bus;

public abstract class Arret {
	private int id;
	protected String nom;
	protected int latitude;
	protected int longitude;
	
	public abstract void operationArret();

}