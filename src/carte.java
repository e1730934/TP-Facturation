
public abstract class carte {
String nomClient, adresse;



 public carte(String nomClient, String adresse) {
	this.nomClient = nomClient;
	this.adresse = adresse;
}



@Override
public String toString() {
	return "carte [nomClient=" + nomClient + ", adresse=" + adresse + "]";
}


}

