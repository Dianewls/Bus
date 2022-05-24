package reseau_de_bus;

public class CreateReseau {
	
	private ReseauBuilder reseauBuilder;
	
	public void setReseauBuilder(ReseauBuilder rb) {
		reseauBuilder = rb;
	}
	public Reseau getReseau() {
		return reseauBuilder.getReseau();
	}
	public void createReseau() {
		reseauBuilder.createNewReseau();
		reseauBuilder.buildLignes();
	}

}
