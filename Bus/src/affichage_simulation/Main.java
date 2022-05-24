package affichage_simulation;
import reseau_de_bus.Bus;
import reseau_de_bus.Reseau;

public class Main {

		public static void main(String[] args) {
			Reseau reseau;
			reseau = Reseau.getInstance();
			//bus
			Bus n1 = new Bus(1, "Long", "B01");
			Bus n2 = new Bus(2, "court", "B02");
			Bus n3 = new Bus(3, "Long", "B03");

	}

}
