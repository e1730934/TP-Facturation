
public class recompenseAirmilesCredit extends recompenseAirmiles {


	@Override
	public void recompenser(facturationAvecCarte f) {
		int nbrAirmilesAjouter = 2*((int) Math.floor(f.montant));
		((carteAirmiles) f.card).nombreMiles +=nbrAirmilesAjouter;
		System.out.println(nbrAirmilesAjouter);
		

	}

}
