package reseau_de_bus;

public abstract class ReseauBuilder {

	protected Reseau reseau; 
	public Reseau getReseau() {
	    return reseau;
	}
	public void createNewReseau() {
		reseau = Reseau.getInstance();
	}
	public abstract void buildLignes();
	
//	public abstract void buildBus();
//	public abstract void buildArrets();
}
