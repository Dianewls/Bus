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
	@Override
	public String toString() {
		return "Arret: id=" + id + ", nom=" + nom + ", latitude=" + latitude + ", longitude=" + longitude ;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the latitude
	 */
	public int getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	/**
	 * @return the longitude
	 */
	public int getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	
	
}