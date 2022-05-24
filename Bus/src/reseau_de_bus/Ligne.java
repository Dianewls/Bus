package reseau_de_bus;

import java.util.ArrayList;
import java.util.List;

public abstract class Ligne extends Arret {
	private int id;
	protected String nom;
	protected List<Arret> listeArrets;
	protected ArrayList<Bus> listeBus;
	//affecter bus qui circulent sur une ligne
	public abstract void operationLigne();
}