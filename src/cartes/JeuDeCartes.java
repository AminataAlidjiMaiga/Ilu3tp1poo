package cartes;

import java.util.ArrayList;
import java.util.List;
import utils.Utils;

//import org.jcp.xml.dsig.internal.dom.Utils;

import cartes.Pobleme.Type;

public class JeuDeCartes {
	
	private Carte[] typesDeCarte = new Carte[19];
    private List<Carte> listeCartes = new ArrayList<>();
		public JeuDeCartes() {
	        typesDeCarte[0] = new Botte(1, Type.FEU);
	        typesDeCarte[1] = new Botte(1, Type.ESSENCE);
	        typesDeCarte[2] = new Botte(1, Type.CREVAISON);
	        typesDeCarte[3] = new Botte(1, Type.ACCIDENT);

	        typesDeCarte[4] = new Attaque(5, Type.FEU);
	        typesDeCarte[5] = new Attaque(3, Type.ESSENCE);
	        typesDeCarte[6] = new Attaque(3, Type.CREVAISON);
	        typesDeCarte[7] = new Attaque(3, Type.ACCIDENT);

	        typesDeCarte[8] = new Parade(14, Type.FEU);
	        typesDeCarte[9] = new Parade(6, Type.ESSENCE);
	        typesDeCarte[10] = new Parade(6, Type.CREVAISON);
	        typesDeCarte[11] = new Parade(6, Type.ACCIDENT);
	        typesDeCarte[12] = new DebutLimite(4);
	        typesDeCarte[13] = new FinLimite(6);

	        typesDeCarte[14] = new Borne(10, 25);
	        typesDeCarte[15] = new Borne(10, 50);
	        typesDeCarte[16] = new Borne(10, 75);
	        typesDeCarte[17] = new Borne(12, 100);
	        typesDeCarte[18] = new Borne(4, 200);


	        List<Carte> liste = new ArrayList<>();
	        for (int i = 0; i < 19; i++) {
	            Carte carte = typesDeCarte[i];
	            for (int j = 0; j < carte.getNombre(); j++) {
	                liste.add(carte);
	            }
	        }
	        
	        listeCartes=Utils.melanger(liste);

	    }

	    public List<Carte> getListeCartes() {
	        return listeCartes;
	    }
	    //ne marche peut-etre pas 
	    public boolean checkCount() {
	        int nb=0;
	        for(Carte c : listeCartes) {
	            for(Carte e : listeCartes) {
	                if (e.equals(c)) {
	                    nb++;
	                }
	            }
	            if (nb != c.getNombre()) return false;
	        }
	        return true;
	    }

}
