package reseau_de_bus;

import java.util.ArrayList;
import java.util.List;

public class Reseau extends Ligne {
	protected List<Ligne> listeLigne;
	private static Reseau instance;
	
	private Reseau() {
		super();
		this.listeLigne = new ArrayList<Ligne>();
	}

	public static synchronized Reseau getInstance() {
		if (instance == null) {
			instance = new Reseau();
		}
		return instance;
	}
	
	@Override
	public void operationArret() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void operationLigne() {
		// TODO Auto-generated method stub
		
	}

}