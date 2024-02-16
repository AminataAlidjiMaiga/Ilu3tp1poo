package cartes;

public abstract class Pobleme extends Carte {
	public enum Type{FEU,ESSENCE,CREVAISON,ACCIDENT};
	private Type t;
	public Pobleme(int nombre, Type t) {
		super(nombre);
		this.t=t;
	}
	
	public Type getType() {
		return t;
	}

}
