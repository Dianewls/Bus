package state;

import reseau_de_bus.Arret;
import reseau_de_bus.Bus;
import reseau_de_bus.Ligne;

public class ChargesPassagers implements BusState {

	@Override
	public void state(StateContext sc, Bus b, Ligne l, Arret a) {
		System.out.println("Il charge les passagers à l'arrêt: "+a.getId());
		
	}

}
