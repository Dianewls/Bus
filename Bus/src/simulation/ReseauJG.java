package simulation;

import java.util.ArrayList;

import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

import affichage_simulation.JGraphExemple1;
import reseau_de_bus.Arret;
import reseau_de_bus.Bus;
import reseau_de_bus.Ligne;
import state.Affectation;
import state.ChargesPassagers;
import state.Circule;
import state.StateContext;

public class ReseauJG extends JFrame {
	
	 private static final long serialVersionUID = -8123406571694511514L;
	 
	  public ReseauJG() {
	    super("JGrapghX tutoriel: Exemple 1");
	 
	    mxGraph graph = new mxGraph();
	    Object parent = graph.getDefaultParent();
	    
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
		graph.getModel().beginUpdate();
		for(int i=0; i<l1.getListeArrets().size();i=i+2) {
			System.out.println(i);
			try {
			      Object v1 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(i).getId(), 20+i*100, 20+i*50, 80, 30);
			      Object v2;
			      if(i==l1.getListeArrets().size()-1) {
			    	   v2 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(0).getId(), 240+i*100, 150+i*50, 80, 30);
			      }else {
			    	   v2 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(i+1).getId(), 140+i*100, 150+i*50, 80, 30);
			      }
			      graph.insertEdge(parent, null, "", v1, v2);
			    } finally {
			      graph.getModel().endUpdate();
			    }
			 
//			StateContext stateContext = new StateContext(new Affectation(),b1,l1,l1.getListeArrets().get(i));
//			stateContext.state();
//	        stateContext.setState(new ChargesPassagers(),b1,l1,l1.getListeArrets().get(i));
//	        stateContext.state();
//	        stateContext.setState(new Affectation(),b2,l2,l2.getListeArrets().get(i));
//			stateContext.state();
//			stateContext.setState(new Circule(),b2,l2,l2.getListeArrets().get(i));
//	        stateContext.state();
//	        stateContext.setState(new Affectation(),b1,l1,l1.getListeArrets().get(i));
//			stateContext.state();
//	        stateContext.setState(new Circule(),b1,l1,l1.getListeArrets().get(i));
//	        stateContext.state();
//	        stateContext.setState(new Affectation(),b2,l2,l2.getListeArrets().get(i));
//			stateContext.state();
//			stateContext.setState(new ChargesPassagers(),b2,l2,l2.getListeArrets().get(i));
//	        stateContext.state();
		}
	    
	    
	    mxGraphComponent graphComponent = new mxGraphComponent(graph);
	    getContentPane().add(graphComponent);
	  }
	 
	  /**
	   * @param args
	   */
	  public static void main(String[] args) {
		  ReseauJG frame = new ReseauJG();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400, 320);
	    frame.setVisible(true);
	  }
}
