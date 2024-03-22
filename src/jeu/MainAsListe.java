package jeu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cartes.Carte;

public class MainAsListe implements Main {
	private List<Carte> l =new ArrayList<>();

	@Override
	public void prendre(Carte c) {
		//System.out.println("botte feu, la limite dans prendre ");
				l.add(c);
		
	}

	@Override
	public void jouer(Carte c) {
		assert(l.contains(c));
		l.remove(c);
		
	}

	@Override
	public Iterator<Carte> iter_c() {
		return l.iterator();
	}
	public List<Carte> getlist()
	{
		return l;
	}

}
