package reseau_de_bus;
public class Bus {
	private int id;
	private String modele;
	private String immatriculation;
	
	public Bus(int id, String modele, String immatriculation) {
		super();
		this.id = id;
		this.modele = modele;
		this.immatriculation = immatriculation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	
	public void circuler() {
		
	}

	@Override
	public String toString() {
		return "Bus: id=" + id + ", modele=" + modele + ", immatriculation=" + immatriculation ;
	}
	
}
