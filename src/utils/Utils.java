package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Utils {
	private static Random rand = new Random();


	public static <C> C extraire(List<C> liste) {
		int r = rand.nextInt(liste.size());
		ListIterator<C> iterateur = liste.listIterator();
		for(int i = 0; i < r; i++)
			if(iterateur.hasNext()) iterateur.next();
		C carte = iterateur.next();
		iterateur.remove();
		return carte;
	}

	public static <C> List<C> melanger(List<C> liste) {
		List<C> listeMelange = new ArrayList<>();
		int n = liste.size();
		for (int i = 0; i < n; i++) {
			listeMelange.add(extraire(liste));
		}
		return listeMelange;
	}

	public static <C> boolean verifierMelange(List<C> liste1, List<C> liste2) {
		boolean verification = true;
		for (int i = 0; i < liste1.size() && verification; i++) {
			C elem = liste1.get(i);
			verification = (Collections.frequency(liste1, elem) == Collections.frequency(liste2, elem));
		}
		
		for (int i = 0; i < liste2.size() && verification; i++) {
			C elem = liste2.get(i);
			verification = (Collections.frequency(liste1, elem) == Collections.frequency(liste2, elem));
		}
		return verification;
	}

	public static <C> List<C> rassembler(List<C> liste) {
		List<C> listeRassemble = new ArrayList<>();
		for (int i = 0; i < liste.size(); i++) {
			C elem = liste.get(i);
			if (!listeRassemble.contains(elem)) {
				listeRassemble.add(elem);

				for (int j = i + 1; j < liste.size(); j++) {
					C elem2 = liste.get(j);
					if (elem == elem2) {
						listeRassemble.add(elem2);
					}
				}
			}

		}
		return listeRassemble;
	}

	public static <C> boolean verifierRassemblement(List<C> liste) {
		if(liste.isEmpty()) {
			return true;
		}
		C cur = liste.get(0);
		List<C> subListe;
		for(C e : liste) {
			if(!e.equals(cur)) {
				subListe = liste.subList(liste.indexOf(e), liste.size());
				for(C se : subListe) {
					if(se.equals(cur)) {
						return false;
					}
				}
					
				cur = e;
			}
		}
		return true;
	}

}
