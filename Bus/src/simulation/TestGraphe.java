package simulation;

import java.util.ArrayList;

import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;

import reseau_de_bus.Arret;
import reseau_de_bus.Bus;
import reseau_de_bus.Ligne;
import state.Affectation;
import state.ChargesPassagers;
import state.Circule;
import state.StateContext;

public class TestGraphe extends JFrame{
	mxGraph graph;
	Object parent;
	
	ArrayList<Arret> listeArretsN3 = new ArrayList<Arret>();
    ArrayList<Arret> listeArretsN2 = new ArrayList<Arret>();
    ArrayList<Arret> listeArretsL = new ArrayList<Arret>();
    ArrayList<Arret> listeArretsN4 = new ArrayList<Arret>();
    
	static Bus b1= new Bus(1,"Mercedes", "MC001");
	Bus b2= new Bus(2,"Mercedes", "MC002");
	Bus b3= new Bus(3,"Mercedes", "MC003");
	static Ligne l1;
	private static final long serialVersionUID = -8123406571694511514L;

	  public static void main(String[] args) throws InterruptedException {
		  TestGraphe frame = new TestGraphe();
		  frame.createReseau();
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setSize(800, 700);
		  frame.setVisible(true);
		  frame.state(b1,l1);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setSize(1200, 700);
	      frame.setVisible(true);
	  } 
	  public TestGraphe() {
	    super("JGrapghX tutoriel: Test graphe TEST");
	    graph = new mxGraph();
	    parent = graph.getDefaultParent();
	  }
	  public void createReseau() {

	    Arret a1=new Arret( 1, "Cirque Jules Vernes", 540, 230);
	    Arret a2=new Arret( 2, "Upjv St Leu", 540, 320 );
        Arret a3=new Arret( 3, "Citadelle", 360, 330);
        Arret a4=new Arret( 4, "Vogelle", 180, 350);
        Arret a5=new Arret( 5, "Citadelle", 30, 250);
        Arret a6=new Arret( 6, "Vogelle", 180, 180);
        Arret a7=new Arret( 7, "Gare du Nord", 360, 200);
	    
		int x=400;
		int y=1;
		Arret a8=new Arret( 8, "Vogelle",30+x, 100+y);
		Arret a9=new Arret( 9, "Citadelle", 180+x, 30+y);
        Arret a10=new Arret( 10, "Vogelle", 360+x, 50+y);
        Arret a11=new Arret( 11, "Gare du Nord", 540+x, 80+y);
        Arret a12=new Arret( 12, "Cirque Jules Vernes", 470+x, 150+y);
        Arret a13=new Arret( 13, "Citadelle", 360+x, 250+y);
        
        int x2=500;
        int y2=100;
        Arret a14=new Arret( 14, "Vogelle",30+x2, 50+y2);
        Arret a15=new Arret( 15, "Citadelle", 180+x2, 30+y2);
        Arret a16=new Arret( 16, "Vogelle", 450+x2, 150+y2);
        Arret a17=new Arret( 17, "Gare du Nord", 300+x2, 300+y2);
        Arret a18=new Arret( 18, "Cirque Jules Vernes", 540+x2, 170+y2);
        
        int x1=100;
        int y1=300;
        
        Arret a19=new Arret( 19, "Vogelle", 450+x1, 170+y1);
        Arret a20=new Arret( 20, "Cirque Jules Vernes", 320+x1, 200+y1);
        Arret a21=new Arret( 21, "Upjv St Leu", 100+x1, 200+y1);
        Arret a22=new Arret( 22, "Citadelle", 220+x1, -30+y1);

		listeArretsN3.add(a1);
		listeArretsN3.add(a2);
		listeArretsN3.add(a3);
		listeArretsN3.add(a4);
		listeArretsN3.add(a5);
		listeArretsN3.add(a6);
		listeArretsN3.add(a7);
		
		listeArretsN2.add(a1);
		listeArretsN2.add(a8);
        listeArretsN2.add(a9);
        listeArretsN2.add(a10);
        listeArretsN2.add(a11);
        listeArretsN2.add(a12);
        listeArretsN2.add(a13);
        
        listeArretsL.add(a1);
        listeArretsL.add(a14);
        listeArretsL.add(a15);
        listeArretsL.add(a12);
        listeArretsL.add(a16);
        listeArretsL.add(a17);
        listeArretsL.add(a18);
        listeArretsL.add(a2);
        
        listeArretsN4.add(a1);
        listeArretsN4.add(a2);
        listeArretsN4.add(a19);
        listeArretsN4.add(a20);
        listeArretsN4.add(a21);
        listeArretsN4.add(a4);
        listeArretsN4.add(a22);
        
        String styleVert = mxConstants.STYLE_STROKECOLOR + "=#00ff00";
        String styleJaune = mxConstants.STYLE_STROKECOLOR + "=#FFFF00";
        String styleRouge = mxConstants.STYLE_STROKECOLOR + "=#FF0000";
        
		
		ArrayList<Bus> listeBusN3=new ArrayList<Bus>();
		
		 l1=new Ligne(1,"N1",listeArretsN3);
		Ligne l2=new Ligne(2,"N2",listeArretsN2);
		Ligne l3=new Ligne(2,"N2",listeArretsL);
		Ligne l4=new Ligne(2,"N2",listeArretsN4);
		
		graph.getModel().beginUpdate();
		Object v0=null, v1 = null,v2 = null,vN2 = null, vN2_0 = null,vN2_2 = null, vL = null, vL_0 = null,vL_2 = null, vN4 = null, vN4_0 = null,vN4_2 = null;
		String styleEnfant1 = mxConstants.STYLE_FILLCOLOR + "=#00ff00";
		
		v1 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(0).getId(), l1.getListeArrets().get(0).getLatitude(), l1.getListeArrets().get(0).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
		v0=v1;
		
		vN2 = graph.insertVertex(parent, null, "Arret"+l2.getListeArrets().get(0).getId(), l2.getListeArrets().get(0).getLatitude(), l2.getListeArrets().get(0).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
        vN2_0=vN2;
        
        vL = graph.insertVertex(parent, null, "Arret"+l3.getListeArrets().get(0).getId(), l3.getListeArrets().get(0).getLatitude(), l3.getListeArrets().get(0).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
        vL_0=vL;
        
        vN4 = graph.insertVertex(parent, null, "Arret"+l4.getListeArrets().get(0).getId(), l4.getListeArrets().get(0).getLatitude(), l4.getListeArrets().get(0).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
        vN4_0=vN4;
		
		for(int i=1; i<l1.getListeArrets().size()-1;i++) {
			if (i <= (l1.getListeArrets().size()-1)/2) {
			    v2 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(i).getId(), l1.getListeArrets().get(i).getLatitude(), l1.getListeArrets().get(i).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
			    vN2_2 = graph.insertVertex(parent, null, "Arret"+l2.getListeArrets().get(i).getId(), l2.getListeArrets().get(i).getLatitude(), l2.getListeArrets().get(i).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
			    vL_2 = graph.insertVertex(parent, null, "Arret"+l3.getListeArrets().get(i).getId(), l3.getListeArrets().get(i).getLatitude(), l3.getListeArrets().get(i).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
			    vN4_2 = graph.insertVertex(parent, null, "Arret"+l4.getListeArrets().get(i).getId(), l4.getListeArrets().get(i).getLatitude(), l4.getListeArrets().get(i).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
			} else {
			    v2 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(i).getId(), l1.getListeArrets().get(i).getLatitude(), l1.getListeArrets().get(i).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
			    vN2_2 = graph.insertVertex(parent, null, "Arret"+l2.getListeArrets().get(i).getId(), l2.getListeArrets().get(i).getLatitude(), l2.getListeArrets().get(i).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
			    vL_2 = graph.insertVertex(parent, null, "Arret"+l3.getListeArrets().get(i).getId(), l3.getListeArrets().get(i).getLatitude(), l3.getListeArrets().get(i).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
			    vN4_2 = graph.insertVertex(parent, null, "Arret"+l4.getListeArrets().get(i).getId(), l4.getListeArrets().get(i).getLatitude(), l4.getListeArrets().get(i).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
			}
			
			 graph.insertEdge(parent, null, "", v1, v2);
			 v1=v2;
			 
			 graph.insertEdge(parent, null, "", vN2, vN2_2,styleVert);
			 vN2=vN2_2;
			 
			 graph.insertEdge(parent, null, "", vL, vL_2,styleRouge);
             vL=vL_2;
             
             graph.insertEdge(parent, null, "", vN4, vN4_2,styleJaune);
             vN4=vN4_2;
		}

		v2 = graph.insertVertex(parent, null, "Arret"+l1.getListeArrets().get(l1.getListeArrets().size()-1).getId(), l1.getListeArrets().get(l1.getListeArrets().size()-1).getLatitude(), l1.getListeArrets().get(l1.getListeArrets().size()-1).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
		graph.insertEdge(parent, null, "", v1, v2);
        graph.insertEdge(parent, null, "", v2, v0);
        
		vN2_2 = graph.insertVertex(parent, null, "Arret"+l2.getListeArrets().get(l2.getListeArrets().size()-1).getId(), l2.getListeArrets().get(l2.getListeArrets().size()-1).getLatitude(), l2.getListeArrets().get(l2.getListeArrets().size()-1).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
		graph.insertEdge(parent, null, "", vN2, vN2_2, styleVert);
        graph.insertEdge(parent, null, "", vN2_2, vN2_0, styleVert);
        
		vL_2 = graph.insertVertex(parent, null, "Arret"+l3.getListeArrets().get(l3.getListeArrets().size()-1).getId(), l3.getListeArrets().get(l3.getListeArrets().size()-1).getLatitude(), l3.getListeArrets().get(l3.getListeArrets().size()-1).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
		graph.insertEdge(parent, null, "", vL, vL_2, styleRouge);
        graph.insertEdge(parent, null, "", vL_2, vL_0, styleRouge);
        
        vN4_2 = graph.insertVertex(parent, null, "Arret"+l4.getListeArrets().get(l4.getListeArrets().size()-1).getId(), l4.getListeArrets().get(l4.getListeArrets().size()-1).getLatitude(), l4.getListeArrets().get(l4.getListeArrets().size()-1).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
        graph.insertEdge(parent, null, "", vN4, vN4_2, styleJaune);
        graph.insertEdge(parent, null, "", vN4_2, vN4_0, styleJaune);
        
		 
		 graph.getModel().endUpdate();
		    mxGraphComponent graphComponent = new mxGraphComponent(graph);
		    getContentPane().add(graphComponent);
	  }  
	  public void state(Bus b,Ligne l) throws InterruptedException {
		  
		  for(int i=0; i<l.getListeArrets().size();i++) {
			  
				StateContext stateContext = new StateContext(new ChargesPassagers(),b,l,l.getListeArrets().get(i));
				stateContext.state();
				Thread.sleep(5000);
				if(i!=0) {
					graph.insertVertex(parent, null, "Arret"+l.getListeArrets().get(i-1).getId(), l.getListeArrets().get(i-1).getLatitude(), l.getListeArrets().get(i-1).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
				}
				graph.insertVertex(parent, null, "Arret"+l.getListeArrets().get(i).getId()+" - Bus "+b.getId(), l.getListeArrets().get(i).getLatitude(), l.getListeArrets().get(i).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE);
				
				Thread.sleep(5000);
		        stateContext.setState(new Circule(),b,l,l.getListeArrets().get(i));
		        stateContext.state();
//		        Object v;
//		        if(i<l.getListeArrets().size()-1) {
//		        	v=graph.insertEdge(parent, null, "Bus "+b.getId(), graph.insertVertex(parent, null, "Arret"+l.getListeArrets().get(i).getId()+" - Bus "+b.getId(), l.getListeArrets().get(i).getLatitude(), l.getListeArrets().get(i).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE), graph.insertVertex(parent, null, "Arret"+l.getListeArrets().get(i+1).getId()+" - Bus "+b.getId(), l.getListeArrets().get(i+1).getLatitude(), l.getListeArrets().get(i+1).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE));
//		        
//		        }
		       // graph.deleteEdge(parent,v);
//		        Thread.sleep(5000);
//		        
//		        graph.insertEdge(parent, null, "yyyyyyy", graph.insertVertex(parent, null, "Arret"+l.getListeArrets().get(i).getId()+" - Bus "+b.getId(), l.getListeArrets().get(i).getLatitude(), l.getListeArrets().get(i).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE), graph.insertVertex(parent, null, "Arret"+l.getListeArrets().get(i+1).getId()+" - Bus "+b.getId(), l.getListeArrets().get(i+1).getLatitude(), l.getListeArrets().get(i+1).getLongitude(), 80, 30, mxConstants.STYLE_SHAPE + "="+mxConstants.SHAPE_DOUBLE_ELLIPSE));
//				
			}
		  
		}
		
//		    Arret a1=new Arret( 1, "Arret 1", 200, 120);
//		    Arret a2=new Arret( 2, "Arret 2", 200, 160 );
//	        Arret a3=new Arret( 3, "Arret 3", 160, 190);
//	        Arret a4=new Arret( 4, "Arret 4", 90, 190);
//	        Arret a5=new Arret( 5, "Arret 5", 30, 170);
//	        Arret a6=new Arret( 6, "Arret 6", 50, 90);
//	        Arret a7=new Arret( 7, "Arret 7", 130, 80);
//		    
//			Arret a8=new Arret( 8, "Arret 8",190, 60);
//			Arret a9=new Arret( 9, "Arret 9", 240, 20);
//	        Arret a10=new Arret( 10, "Arret 10", 310, 20);
//	        Arret a11=new Arret( 11, "Arret 11", 350, 70);
//	        Arret a12=new Arret( 12, "Arret 12", 350, 120);
//	        Arret a13=new Arret( 13, "Arret 13", 280, 130);
//	        
//	        Arret a14=new Arret( 14, "Arret 14",260, 90);
//	        Arret a15=new Arret( 15, "Arret 15", 320, 90);
//	        Arret a16=new Arret( 16, "Arret 16", 360, 90);
//	        Arret a17=new Arret( 17, "Arret 17", 310, 200);
//	        Arret a18=new Arret( 18, "Arret 18", 260,200);
//	        
//	        Arret a19=new Arret( 19, "Arret 19", 230, 230);
//	        Arret a20=new Arret( 20, "Arret 20", 180, 280);
//	        Arret a21=new Arret( 21, "Arret 21", 90, 150);
//	        Arret a22=new Arret( 22, "Arret 22", 120, 150);
	  	    
}
