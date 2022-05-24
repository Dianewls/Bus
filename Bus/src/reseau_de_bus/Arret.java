package reseau_de_bus;

public class Arret {
	private int id;
	protected String nom;
	protected int latitude;
	protected int longitude;
	
	public Arret(int id, String nom, int latitude, int longitude) {
		super();
		this.id = id;
		this.nom = nom;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public Arret() {
		// TODO Auto-generated constructor stub
	}
	public void operationArret() {
	}

}