package cartes;
//vert publique
//rouge privée
public abstract class Carte {
	private int nombre;
	
	public Carte(int nombre) {
		this.nombre=nombre;
	}
	public int getNombre() {
		return nombre;
	}
	

}
