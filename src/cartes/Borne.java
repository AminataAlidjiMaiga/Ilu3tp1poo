package cartes;

public class Borne extends Carte {
	private int km;
	public Borne(int nombre,int km) {
		super(nombre);
		this.km=km;
	}
	public int getKm() {
		 return km;
	 }
	public String toString()
	 {

	 switch(km)
	 {
	 case 25:
		 return "25";
	 case 50:
		 return "50";
	 case 100:
		 return "100";
	 case 75:
		 return "75";
	 default:
		 return "200";
	 }
	}

}
