package state;

import reseau_de_bus.Arret;
import reseau_de_bus.Bus;
import reseau_de_bus.Ligne;

public class StateContext {
	
	private BusState currentState;
	Bus b; Ligne l; Arret a;
	  
    public StateContext(BusState state,Bus b, Ligne l, Arret a) 
    {
        this.currentState = state;
        this.b=b;
        this.l=l;
        this.a=a;
    }
  
    public void setState(BusState state,Bus b, Ligne l, Arret a) 
    {
        this.currentState = state;
        this.b=b;
        this.l=l;
        this.a=a;
    }
    
    public void state() 
    {
        currentState.state(this,this.b,this.l, this.a);
    }
}
