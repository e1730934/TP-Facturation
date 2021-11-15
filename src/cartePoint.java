
public class cartePoint extends carte {
	
	int nombrePoint;


	public cartePoint(String nomClient, String adresse, int nombrePoint) {
		super(nomClient, adresse);
		this.nombrePoint = nombrePoint;
	}


	@Override
	public String toString() {
		return "cartePoint [nombrePoint=" + nombrePoint + ", nomClient=" + nomClient + ", adresse=" + adresse + "]";
	}


}
