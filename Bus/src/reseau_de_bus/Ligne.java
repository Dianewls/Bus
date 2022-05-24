package reseau_de_bus;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Ligne{
	private int id;
	protected String nom;
	protected Set<Arret> listeArrets;
	protected ArrayList<Bus> listeBus;
	
	public Ligne() {
		super();
	}
	
	public Ligne(int id, String nom, Set<Arret> listeArrets, ArrayList<Bus> listeBus) {
		this.id = id;
		this.nom = nom;
		this.listeArrets = listeArrets;
		this.listeBus = listeBus;
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
	//affecter bus qui circulent sur une ligne
	public void operationLigne() {
	}

	@Override
	public String toString() {
		return "Ligne [id=" + id + ", nom=" + nom + ", listeArrets=" + listeArrets + ", listeBus=" + listeBus + "]";
	}
	
}