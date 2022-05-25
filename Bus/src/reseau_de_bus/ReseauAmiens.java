package reseau_de_bus;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReseauAmiens extends ReseauBuilder {
	
	ArrayList<Ligne> listeLignes=new ArrayList<Ligne>();

	@Override
	public void buildLignes() {
		
		ArrayList<Ligne> listeLignes=new ArrayList<Ligne>();
		
		ArrayList<Arret> listeArretsN3 = new ArrayList<Arret>();
		Arret a1=new Arret( 1, "Citadelle", 1, 1);
		Arret a2=new Arret( 2, "Vogelle", 1, 1);
		Arret a5=new Arret( 5, "Upjv St Leu", 1, 1);
		Arret a3=new Arret( 3, "Gare du Nord", 1, 1);
		Arret a4=new Arret( 4, "Cirque Jules Vernes", 1, 1);
		listeArretsN3.add(a1);
		listeArretsN3.add(a2);
		listeArretsN3.add(a3);
		listeArretsN3.add(a4);
		listeArretsN3.add(a5);
		
		ArrayList<Bus> listeBusN3=new ArrayList<Bus>();
		listeBusN3.add(new Bus(1,"Mercedes", "MC001"));
		listeBusN3.add(new Bus(2,"Mercedes", "MC002"));
		listeBusN3.add(new Bus(3,"Mercedes", "MC003"));
		
		ArrayList<Arret> listeArretsN2 = new ArrayList<Arret>();
		Arret a_n2_1=new Arret( 1, "Cirque jules vernes", 1, 1);
		Arret a_n2_2=new Arret( 2, "Gare du Nord", 1, 1);
		Arret a_n2_3=new Arret( 5, "Res Bailly", 1, 1);
		Arret a_n2_4=new Arret( 3, "Eglise st Leu", 1, 1);
		Arret a_n2_5=new Arret( 4, "Res CDG", 1, 1);
		listeArretsN2.add(a_n2_1);
		listeArretsN2.add(a_n2_2);
		listeArretsN2.add(a_n2_3);
		listeArretsN2.add(a_n2_4);
		listeArretsN2.add(a_n2_5);
		
		ArrayList<Bus> listeBusN2=new ArrayList<Bus>();
		listeBusN2.add(new Bus(4,"Mercedes", "MC001L2"));
		listeBusN2.add(new Bus(5,"Mercedes", "MC002L2"));
		listeBusN2.add(new Bus(6,"Mercedes", "MC003L2"));

		listeLignes.add(new Ligne(2, "N2", listeArretsN2 , listeBusN2));
		listeLignes.add(new Ligne(3, "N3", listeArretsN3 , listeBusN3));
		reseau.setListeLignes(listeLignes);
		
	}

	
	
	
	
	
	
	
	
	
//	
//	Set<Arret> listeArretsN3 = new HashSet<Arret>();
//	Arret a1=new Arret( 1, "Citadelle", 1, 1);
//	Arret a2=new Arret( 2, "Vogelle", 1, 1);
//	Arret a5=new Arret( 5, "Upjv St Leu", 1, 1);
//	Arret a3=new Arret( 3, "Gare du Nord", 1, 1);
//	Arret a4=new Arret( 4, "Cirque Jules Vernes", 1, 1);
//	listeArretsN3.add(a1);
//	listeArretsN3.add(a2);
//	listeArretsN3.add(a3);
//	listeArretsN3.add(a4);
//	listeArretsN3.add(a5);
//	
//	ArrayList<Bus> listeBusN3=new ArrayList<Bus>();
//	listeBusN3.add(new Bus(1,"Mercedes", "MC001"));
//	listeBusN3.add(new Bus(2,"Mercedes", "MC002"));
//	listeBusN3.add(new Bus(3,"Mercedes", "MC003"));

	//listeLignes.add(new Ligne(1, "N1", listeArrets , listeBus));
	
	
//	@Override
//	public void buildBus() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void buildArrets() {
//		// TODO Auto-generated method stub
//		
//	}

}
