package jeu;
import cartes.*;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class Sabot implements Iterable<Carte>{
	
	private int nbCartes;
	private Carte[]  pioches;
	private int indiceiter=0;
	private int Nbop=0;
	
	public Sabot(int capacite)  {
		this.pioches=new Carte[capacite];
		this.nbCartes=0;
	}
	
	public int nbcarte()
	{
		return this.nbCartes;
	}

	public boolean estVide()
	{
		return pioches.length==0;
	}
	
	public void ajouterCarte(Carte c) 
	{
		if (this.nbCartes>pioches.length)
		{
			 throw new ArrayIndexOutOfBoundsException("Capacité atteinte");
		}
		else
		{
			pioches[nbCartes]=c;
			nbCartes++;
			}
		Nbop++;
	}
	
	public void ajouterFamilleCarte(Carte c, int nb )
	 {
		 for(int i=0;i<nb;i++)
		 { 
			 ajouterCarte(c);
		 }
	 }
	
	public void ajouterFamilleCarte(Carte...cartes)
	{
		for(Carte c:cartes)
		{
			pioches[nbCartes++]=c;
			Nbop++;
		}
	}
	
	@Override
	public Iterator<Carte> iterator() {
		return new Iterateur();
	}
	
	///////////////////////
	////////////CLASSE INTERNE Implémntant la classe itérable
	private class Iterateur implements Iterator<Carte>
	{
		private boolean nextEffectue = false;
		private int Nbopref=Nbop;
		
		/////////////
		/////HASNEXT
		public boolean hasNext()
		{
			return indiceiter<pioches.length;
		}
		
		private void VerificationConcurrence()
		{
			if(Nbop!=Nbopref)
			{
				throw new ConcurrentModificationException();
			}
		}
		
		///////////
		//////NEXT
		public Carte next()
		{
			VerificationConcurrence();
			if (hasNext()){
				Carte carte=pioches[indiceiter];
				nextEffectue=true;
				indiceiter++;
				return carte;}
			else{
				throw new NoSuchElementException();
				}
			}
		
		/////////////////////
		///////////REMOVE
		@Override
		public void remove()
		{
			VerificationConcurrence();
			if (nbCartes < 1 || !nextEffectue) 
			{ 
				throw new IllegalStateException(); 
				}
			else {
				for(int i=indiceiter-1;i<nbCartes;i++)
				{
					pioches[i]=pioches[i+1];
				}	
			}
			nextEffectue = false;
			indiceiter--;
			nbCartes--;	
			Nbop++;
			Nbopref++;
		}
	}
	////////fin classe interne 
	///////////////////
	
	public Carte piocher()
	{
		if (this.estVide())
		{
			return null;
		}
		else
		{
			Iterator<Carte> c =iterator();
			Carte car=c.next();
			System.out.println("Je pioche "+ car.toString());
			c.remove();
			return car;
		}
		
	}}

