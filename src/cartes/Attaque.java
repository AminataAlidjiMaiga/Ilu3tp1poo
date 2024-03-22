package cartes;

public class Attaque extends Bataille {
	private Type t;
	public Attaque(int nombre, Type t) {
		super(nombre, t);
	};
	
	public String toString() {
		switch(super.getType())
		{
		case FEU:
			return "FEU ROUGE";
		case ESSENCE:
			return "PANNE D'ESSENCE";
		case CREVAISON:
			return "CREVAISON";
		case ACCIDENT:
			return "ACCIDENT";
		default:
			return "LIMITE DE VITESSE";
		}
	}

}
