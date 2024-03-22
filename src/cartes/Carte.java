package cartes;

import cartes.Pobleme.Type;

//vert publique
//rouge privée
public abstract class Carte {
	private int nombre;
	public static final Bataille FEU_VERT= new Parade(0, Type.FEU);//parade de type feu Feu_vert
	public static final Bataille FEU_ROUGE=new Attaque(50, Type.FEU);
	
	public Carte(int nombre) {
		this.nombre=nombre;
	}
	public int getNombre() {
		return nombre;
	}
	public boolean equals(Object ob)
	{
		if(ob instanceof Carte)
		{
			return this.getClass()==ob.getClass();
		}
		return false;
	}
	

}
