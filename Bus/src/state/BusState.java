package state;

import reseau_de_bus.*;

public interface BusState {
	void state(StateContext sc, Bus b, Ligne l, Arret a);
}
