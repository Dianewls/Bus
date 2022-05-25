package state;

import reseau_de_bus.Arret;
import reseau_de_bus.Bus;
import reseau_de_bus.Ligne;

public class Circule implements BusState{

	@Override
	public void state(StateContext sc, Bus b, Ligne l, Arret a) {
		int i=a.getId()+1;
		System.out.println("Il circule entre l'arrêt: "+a.getId()+" et l'arrêt: "+i);
		
	}

}
