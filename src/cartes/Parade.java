package cartes;

public class Parade extends Bataille {
	private Type t;
	public Parade(int nombre, Type t) {
		super(nombre, t);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		switch (t) {
		case FEU:
			return "FEU VERT";
		case ESSENCE:
			return "ESSENCE";
		case CREVAISON:
			return "ROUE DE SECOUR";
		case ACCIDENT:
			return "REPARATIONS";
		default:
			return "FIN DE LIMITE DE VITESSE";
		}
	}
	

}
