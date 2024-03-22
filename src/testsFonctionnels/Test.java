package testsFonctionnels;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import cartes.Attaque;
import cartes.Bataille;
import cartes.Borne;
import cartes.Botte;
import cartes.Carte;
import cartes.DebutLimite;
import cartes.FinLimite;
import cartes.JeuDeCartes;
import cartes.Limite;
import cartes.Parade;
import cartes.Pobleme.Type;
import jeu.Joueur;
import jeu.Sabot;
import utils.Utils;

public class Test {

	public static void main(String[] args) {
		
		Carte c=new Attaque(50, Type.ACCIDENT);
		Carte c1=new Parade(50,Type.ACCIDENT);
		Carte c2= new Botte(50,Type.ACCIDENT);
		
		Sabot s=new Sabot(110);
		
		s.ajouterCarte(c);
		s.ajouterCarte(c1);
s.ajouterFamilleCarte(c1, 3);
		
		s.ajouterFamilleCarte(c,c,c );		
		s.ajouterCarte(c2);
		//ça marche mais je dois régler la boucle infinie
			//while (s.nbcarte()!=0)
			//	{
			//s.piocher();
			
			//s.ajouterCarte(c2);
	//} 
			//on commente a la derniere question du tp pour mettre ce qui a en bas 
	
//		while (s.nbcarte()!=0)
//{
//		Iterator<Carte> iter1 =s.iterator();
//		iter1.hasNext();
//		iter1.next();
//		s.ajouterCarte(c2);
//			//iter1.remove();
		//}
		
		System.out.println(c1.equals(c2));
		JeuDeCartes lis=new JeuDeCartes();
		
		System.out.println(lis.getListeCartes());
		//System.out.println(lis.checkCount());
		
		JeuDeCartes jeu = new JeuDeCartes();
		List<Carte> listeCarteNonMelangee = jeu.getListeCartes();
		List<Carte> listeCartes = new ArrayList<>(listeCarteNonMelangee);
		System.out.println(listeCartes);
		listeCartes = Utils.melanger(listeCartes);
		System.out.println(listeCartes);
		System.out.println("liste mélangée sans erreur ? "
		+ Utils.verifierMelange(listeCarteNonMelangee, listeCartes));
		listeCartes = Utils.rassembler(listeCartes);
		System.out.println(listeCartes);
		System.out.println("liste rassemblée sans erreur ? " + Utils.verifierRassemblement(listeCartes));	
	
		//instanciation de sjoueur
        Joueur joueur1 = new Joueur("Joueur 1");
        Joueur joueur2 = new Joueur("Joueur 2");
        List<Joueur> participant= new ArrayList<>();
        participant.add(joueur2);
        participant.add(joueur1);
        ///creation des carte 
        Attaque c9=new Attaque(50, Type.ACCIDENT);
        Attaque c3=new Attaque(50, Type.CREVAISON);
        
       
		
		
		Borne b1=new Borne(50,10);
		Borne b2=new Borne(49,10);
		Borne b3=new Borne(60,10);
		
		Parade c7=new Parade(89,Type.ESSENCE);
		Parade cc=new Parade(50,Type.CREVAISON);
		Parade c8=new Parade(50,Type.CREVAISON);
		
		
		FinLimite f1=new FinLimite(50);
		FinLimite f2=new FinLimite(75);
		
		
		DebutLimite d1= new DebutLimite(25);
		DebutLimite d2=new DebutLimite(50);

        joueur1.donner(cc);
        joueur1.donner(c9);
        joueur1.donner(c3);
        //taille de la main est 3 
      
        joueur1.getCollectionBorne().add(b1);
        joueur1.getCollectionBorne().add(b2);
        joueur1.getCollectionBorne().add(b3);
        

        
        Botte bot12= new Botte(50,Type.FEU);
        
		Botte bot11= new Botte(50,Type.ACCIDENT);
		
        System.out.println("Cartes en main du Joueur 1 :");
        for (Carte carte : joueur1.getMain_joueur().getlist())
        {
        	 System.out.println("-"+ carte);
        	 
        }
        
  ///////test de getLimite()
	      
        //cas1 pile vide 
        System.out.println("Pile vide limite :"+joueur1.getLimite());
        
        ///cas2 sommet de pil est une lin fe limite 
        joueur1.getLimiteV().add(d2);
        joueur1.getLimiteV().add(f1);
        
        System.out.println("sommet finlimite, la limite est: "+joueur1.getLimite());
        
        
        //cas3:le joueur a la bote feu 
        joueur1.getEnsBotte().add(bot11);
        joueur1.getEnsBotte().add(bot12);
        
        System.out.println("botte feu, la limite est: "+joueur1.getLimite());
        
        joueur1.getEnsBotte().clear();
        joueur1.getLimiteV().clear();//vide la pile
        joueur1.getEnsBotte().add(bot12);
        //dernier cas
        joueur1.getLimiteV().add(d2);
        joueur1.getLimiteV().add(f2);
        joueur1.getLimiteV().add(d1);
        
        System.out.println("Last, la limite est: "+joueur1.getLimite());
        
        
        /////GetLimite Marche
	
	}
	

}


