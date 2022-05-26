package affichage_simulation;

import javax.swing.JFrame;
 
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
 
public class JGraphExemple1 extends JFrame {
 
  /** Pour �viter un warning venant du JFrame */
  private static final long serialVersionUID = -8123406571694511514L;
 
  public JGraphExemple1() {
    super("JGrapghX tutoriel: Exemple 1");
 
    mxGraph graph = new mxGraph();
    Object parent = graph.getDefaultParent();
 
    graph.getModel().beginUpdate();
    try {
      Object v1 = graph.insertVertex(parent, null, "Hello", 20, 20, 80, 30);
      Object v2 = graph.insertVertex(parent, null, "World!", 240, 150, 80, 30);
      graph.insertEdge(parent, null, "Edge", v1, v2);
    } finally {
      graph.getModel().endUpdate();
    }
 
    mxGraphComponent graphComponent = new mxGraphComponent(graph);
    getContentPane().add(graphComponent);
  }
 
  /**
   * @param args
   */
  public static void main(String[] args) {
    JGraphExemple1 frame = new JGraphExemple1();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 320);
    frame.setVisible(true);
  }
}
