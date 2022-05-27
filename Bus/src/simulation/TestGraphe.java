package simulation;

import java.util.ArrayList;

import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;

import reseau_de_bus.Arret;
import reseau_de_bus.Bus;
import reseau_de_bus.Ligne;

public class TestGraphe extends JFrame{

	private static final long serialVersionUID = -8123406571694511514L;
	 	
	 /**
	   * @param args
	   */
	  public static void main(String[] args) {
		  TestGraphe frame = new TestGraphe();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400, 320);
	    frame.setVisible(true);
	  } 
	  public TestGraphe() {
	    super("JGrapghX tutoriel: Test graphe TEST");
	 
	    mxGraph graph = new mxGraph();
	    Object parent = graph.getDefaultParent();
	    
	    ArrayList<Arret> listeArretsN3 = new ArrayList<Arret>();
		Arret a1=new Arret( 1, "Citadelle", 1, 1);
		Arret a2=new Arret( 2, "Vogelle", 1, 1);
		Arret a5=new Arret( 5, "Upjv St Leu", 1, 1);
		Arret a3=new Arret( 3, "Gare du Nord", 1, 1);
		Arret a4=new Arret( 4, "Cirque Jules Vernes", 1, 1);
		Arret a6=new Arret( 6, "Citadelle", 1, 1);
		Arret a7=new Arret( 7, "Vogelle", 1, 1);
		Arret a8=new Arret( 8, "Upjv St Leu", 1, 1);
		Arret a9=new Arret( 9, "Gare du Nord", 1, 1);
		Arret a10=new Arret( 10, "Cirque Jules Vernes", 1, 1);
		listeArretsN3.add(a1);
		listeArretsN3.add(a2);
		listeArretsN3.add(a3);
		listeArretsN3.add(a4);
		//listeArretsN3.add(a5);
//		listeArretsN3.add(a6);
//		listeArretsN3.add(a7);
//		listeArretsN3.add(a8);
//		listeArretsN3.add(a9);
//		listeArretsN3.add(a10);
		
		ArrayList<Arret> listeArretsN2 = new ArrayList<Arret>();
		
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
		Object v1 = null,v2 = null,v3 = null,v4 = null,v5 = null, v0=null;
		String styleEnfant1 = mxConstants.STYLE_FILLCOLOR + "=#00ff00";
		int x=0;
		int y=0;
		
		v1 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(0).getId(), 50, 150, 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
		v0=v1;
		for(int i=1; i<l1.getListeArrets().size()-1;i++) {
			if (i<=(l1.getListeArrets().size())/2){
			    v2 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(i).getId(), i*180, i*40, 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
			} else {
				y=((l1.getListeArrets().size())/2)*i*i*i/2;
			    x=(-i*2+50)*5;
			    v2 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(i).getId(), x*2, y+100, 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
			}
			 graph.insertEdge(parent, null, "", v1, v2,mxConstants.STYLE_EDGE + "=" + mxConstants.STYLE_ROUNDED+"=3");
			    v1=v2;
		}
		int i=l1.getListeArrets().size()-1;
		v2 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(l1.getListeArrets().size()-1).getId(), x-i*5, y+i*10, 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
		//v10 = graph.insertVertex(parent, null, "Arret"+l2.getListeArrets().get(getListeArrets().size()-1).getId(), 100+i*120, 250, 80, 30,styleEnfant1);
		graph.insertEdge(parent, null, "", v1, v2);
		graph.insertEdge(parent, null, "", v2, v0);
		//graph.insertEdge(parent, null, "", v9, v10);
		//graph.insertEdge(parent, null, "", v10, v6);
		 
		 graph.getModel().endUpdate();
		    mxGraphComponent graphComponent = new mxGraphComponent(graph);
		    getContentPane().add(graphComponent);
		    
	  }		    
}
