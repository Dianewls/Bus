package affichage_simulation;
import reseau_de_bus.CreateReseau;
import reseau_de_bus.Reseau;
import reseau_de_bus.ReseauAmiens;
import reseau_de_bus.ReseauBuilder;

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
	}

}
