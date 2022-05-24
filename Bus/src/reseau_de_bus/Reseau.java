package reseau_de_bus;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Reseau extends Ligne {
	protected ArrayList<Ligne> listeLignes;
	protected ArrayList<Bus> listeBus;
	protected Set<Arret> listeArrets;
	
	private static Reseau instance;
	
	private Reseau() {
		super();
		this.listeLignes = new ArrayList<Ligne>();
	}

	public static synchronized Reseau getInstance() {
		if (instance == null) {
			instance = new Reseau();
		}
		return instance;
	}
	/**
	 * @return the listeLignes
	 */
	public List<Ligne> getListeLignes() {
		return listeLignes;
	}

	/**
	 * @param listeLignes the listeLignes to set
	 */
	public void setListeLignes(ArrayList<Ligne> listeLignes) {
		this.listeLignes = listeLignes;
	}

	/**
	 * @return the listeBus
	 */
	public ArrayList<Bus> getListeBus() {
		return listeBus;
	}

	/**
	 * @param listeBus the listeBus to set
	 */
	public void setListeBus(ArrayList<Bus> listeBus) {
		this.listeBus = listeBus;
	}

	/**
	 * @return the listeArrets
	 */
	public Set<Arret> getListeArrets() {
		return listeArrets;
	}

	/**
	 * @param listeArrets the listeArrets to set
	 */
	public void setListeArrets(Set<Arret> listeArrets) {
		this.listeArrets = listeArrets;
	}
	
	public void operationArret() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void operationLigne() {
		// TODO Auto-generated method stub
		
	}

}