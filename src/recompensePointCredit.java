
public class recompensePointCredit extends recompensePoint {

	@Override
	public void recompenser(facturationAvecCarte f){
		int nbrPTAjouter = 2*((int) Math.floor(f.montant));
		((cartePoint) f.card).nombrePoint +=nbrPTAjouter;
		
		
	}

}
