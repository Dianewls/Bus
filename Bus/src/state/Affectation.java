package state;

import reseau_de_bus.Arret;
import reseau_de_bus.Bus;
import reseau_de_bus.Ligne;

public class Affectation implements BusState {
	@Override
	public void state(StateContext sc, Bus b, Ligne l, Arret a) {
		System.out.print("Le bus= "+b.getId()+" est affecté à la ligne= "+l.getId()+". ");
	}

}
