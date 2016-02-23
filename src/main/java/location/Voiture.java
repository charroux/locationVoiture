package location;

public class Voiture {

	String immatriculation;
	boolean louer;
	
	public Voiture() {
		super();
	}

	public Voiture(String immatriculation, boolean louer) {
		super();
		this.immatriculation = immatriculation;
		this.louer = louer;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public boolean isLouer() {
		return louer;
	}

	public void setLouer(boolean louer) {
		this.louer = louer;
	}
	
	
	
}
