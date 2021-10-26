
public class carteAirmiles extends carte {

	float nombreMiles;
	

	public carteAirmiles(String nomClient, String adresse, float nombreMiles) {
		super(nomClient, adresse);
		this.nombreMiles = nombreMiles;
	}


	@Override
	public String toString() {
		return "carteAirmiles [nombreMiles=" + nombreMiles + ", nomClient=" + nomClient + ", adresse=" + adresse + "]";
	}





}
