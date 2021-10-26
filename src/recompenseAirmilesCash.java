
public class recompenseAirmilesCash extends recompenseAirmiles {

	@Override
	public void recompenser(facturationAvecCarte f) {
		int nbrAirmilesAjouter = (int) Math.floor(f.montant / 2);
		
		((carteAirmiles) f.card).nombreMiles +=nbrAirmilesAjouter;
		System.out.println("tu connais");
	}
	
}


