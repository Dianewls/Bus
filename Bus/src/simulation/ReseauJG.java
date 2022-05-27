package simulation;

import java.util.ArrayList;

import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
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
		listeArretsN2.add(a3);
		listeArretsN2.add(a7);
		listeArretsN2.add(a8);
		listeArretsN2.add(a9);
		listeArretsN2.add(a10); 
		
		ArrayList<Bus> listeBusN3=new ArrayList<Bus>();
		Bus b1= new Bus(1,"Mercedes", "MC001");
		Bus b2= new Bus(2,"Mercedes", "MC002");
		Bus b3= new Bus(3,"Mercedes", "MC003");
		
		Ligne l1=new Ligne(1,"N1",listeArretsN3);
		Ligne l2=new Ligne(2,"N2",listeArretsN2);
		
		graph.getModel().beginUpdate();
		Object v1 = null,v2 = null,v3 = null,v4 = null,v5 = null;
		Object v6 = null,v7 = null,v8 = null,v9 = null,v10 = null;
		String styleEnfant1 = mxConstants.STYLE_FILLCOLOR + "=#00ff00";
		
		for(int i=0; i<l1.getListeArrets().size();i++) {
		  try {
			switch(i){
		       case 0: 
		    	    v1 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(i).getId(), 20+i*100, 100, 80, 30);
		    	    if(l1.getListeArrets().get(i).getId()!=l2.getListeArrets().get(i).getId()) {
		    	    	v6 = graph.insertVertex(parent, null, "Arret"+l2.getListeArrets().get(i).getId(), 300+i*70, 150, 80, 30,styleEnfant1);
		    	    }else {
		    	    	v6=v3;
		    	    }
		           break;
		       case 1:
		    	    v2 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(i).getId(), 20+i*200, 20+i*30, 80, 30);
		    	    v7 = graph.insertVertex(parent, null, "Arret"+l2.getListeArrets().get(i).getId(), 200+i*200, 50, 80, 30,styleEnfant1);
		    	    graph.insertEdge(parent, null, "", v1, v2);
		    	    graph.insertEdge(parent, null, "", v6, v7);
		           break;
		       case 2:
		    	   v3 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(i).getId(), 20+i*220, 20+i*50, 80, 30);
		    	   v8 = graph.insertVertex(parent, null, "Arret"+l2.getListeArrets().get(i).getId(), 250+i*200, 100, 80, 30,styleEnfant1);
		    	   graph.insertEdge(parent, null, "", v2, v3);
		    	   graph.insertEdge(parent, null, "", v7, v8);
		           break;
		       case 3:
		    	   v4 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(i).getId(), 20+i*130, 20+i*80, 80, 30);
		    	   v9 = graph.insertVertex(parent, null, "Arret"+l2.getListeArrets().get(i).getId(), 200+i*200, 200, 80, 30,styleEnfant1);
		    	   graph.insertEdge(parent, null, "", v3, v4);
		    	   graph.insertEdge(parent, null, "", v8, v9);
		           break;
		       case 4:
		    	   v5 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(i).getId(), 20+i*50, 20+i*50, 80, 30);
		    	   v10 = graph.insertVertex(parent, null, "Arret"+l2.getListeArrets().get(i).getId(), 100+i*120, 250, 80, 30,styleEnfant1);
		    		graph.insertEdge(parent, null, "", v4, v5);
		    		graph.insertEdge(parent, null, "", v5, v1);
		    		graph.insertEdge(parent, null, "", v9, v10);
		    		graph.insertEdge(parent, null, "", v10, v6);
		           break;
		       default:
		           System.out.println("Choix incorrect");
		           break;
		   }
		  } finally {
		      graph.getModel().endUpdate();
		    }
		}
		  	
		    mxGraphComponent graphComponent = new mxGraphComponent(graph);
		    getContentPane().add(graphComponent);
		    
		    
//			System.out.println(i);
//			try {
//			      Object v1 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(i).getId(), 20+i*100, 20+i*50, 80, 30);
//			      Object v2;
//			      if(i==l1.getListeArrets().size()-1) {
//			    	   v2 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(0).getId(), 240+i*100, 150+i*50, 80, 30);
//			      }else {
//			    	   v2 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(i+1).getId(), 140+i*100, 150+i*50, 80, 30);
//			      }
//			      graph.insertEdge(parent, null, "", v1, v2);
//			    } finally {
//			      graph.getModel().endUpdate();
//			    }
			 
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
