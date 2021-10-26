
public class recompensePointCash extends recompensePoint {

	@Override
	public void recompenser(facturationAvecCarte f){
		int nbrPTAjouter = ((int) Math.floor(f.montant));
		((cartePoint) f.card).nombrePoint +=nbrPTAjouter;
		
		
	}

}
