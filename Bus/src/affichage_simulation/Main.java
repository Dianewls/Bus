package affichage_simulation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import reseau_de_bus.Arret;
import reseau_de_bus.Bus;
import reseau_de_bus.CreateReseau;
import reseau_de_bus.Ligne;
import reseau_de_bus.Reseau;
import reseau_de_bus.ReseauAmiens;
import reseau_de_bus.ReseauBuilder;
import state.Affectation;
import state.ChargesPassagers;
import state.Circule;
import state.StateContext;

public class Main {

		public static void main(String[] args) {
			CreateReseau cr = new CreateReseau();
			ReseauBuilder reseauAmiens = new ReseauAmiens();
			cr.setReseauBuilder(reseauAmiens);
			cr.createReseau();
			Reseau rs = cr.getReseau();
			for(int i=0;i<rs.getListeLignes().size();i++) {
				System.out.println(rs.getListeLignes().get(i).toString());
			}
			System.out.println();
			
			ArrayList<Arret> listeArretsN3 = new ArrayList<Arret>();
			Arret a1=new Arret( 1, "Citadelle", 1, 1);
			Arret a2=new Arret( 2, "Vogelle", 1, 1);
			Arret a5=new Arret( 5, "Upjv St Leu", 1, 1);
			Arret a3=new Arret( 3, "Gare du Nord", 1, 1);
			Arret a4=new Arret( 4, "Cirque Jules Vernes", 1, 1);
			listeArretsN3.add(a1);
			listeArretsN3.add(a2);
			listeArretsN3.add(a3);
			//listeArretsN3.add(a4);
			//listeArretsN3.add(a5);
			
			ArrayList<Arret> listeArretsN2 = new ArrayList<Arret>();
			Arret a6=new Arret( 6, "Citadelle", 1, 1);
			Arret a7=new Arret( 7, "Vogelle", 1, 1);
			Arret a8=new Arret( 8, "Upjv St Leu", 1, 1);
			Arret a9=new Arret( 9, "Gare du Nord", 1, 1);
			Arret a10=new Arret( 10, "Cirque Jules Vernes", 1, 1);
			listeArretsN2.add(a6);
			listeArretsN2.add(a7);
			listeArretsN2.add(a8);
			//listeArretsN2.add(a9);
			//listeArretsN2.add(a10); 
			
			ArrayList<Bus> listeBusN3=new ArrayList<Bus>();
			Bus b1= new Bus(1,"Mercedes", "MC001");
			Bus b2= new Bus(2,"Mercedes", "MC002");
			Bus b3= new Bus(3,"Mercedes", "MC003");
			
			Ligne l1=new Ligne(1,"N1",listeArretsN3);
			Ligne l2=new Ligne(2,"N2",listeArretsN2);
			
			for(int i=0; i<l1.getListeArrets().size();i++) {
				StateContext stateContext = new StateContext(new Affectation(),b1,l1,l1.getListeArrets().get(i));
				stateContext.state();
		        stateContext.setState(new ChargesPassagers(),b1,l1,l1.getListeArrets().get(i));
		        stateContext.state();
		        stateContext.setState(new Affectation(),b2,l2,l2.getListeArrets().get(i));
				stateContext.state();
				stateContext.setState(new Circule(),b2,l2,l2.getListeArrets().get(i));
		        stateContext.state();
		        stateContext.setState(new Affectation(),b1,l1,l1.getListeArrets().get(i));
				stateContext.state();
		        stateContext.setState(new Circule(),b1,l1,l1.getListeArrets().get(i));
		        stateContext.state();
		        stateContext.setState(new Affectation(),b2,l2,l2.getListeArrets().get(i));
				stateContext.state();
				stateContext.setState(new ChargesPassagers(),b2,l2,l2.getListeArrets().get(i));
		        stateContext.state();
			}
	}

}
