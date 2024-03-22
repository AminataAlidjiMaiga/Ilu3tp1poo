package jeu;

import java.util.Iterator;

import cartes.Carte;

public interface Main {
	void prendre(Carte c);
	void jouer(Carte c);
	
	Iterator<Carte> iter_c(); ///fournit un iterateur sur les carte 

}
