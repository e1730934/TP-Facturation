
public abstract class facturationAvecCarte extends facturation {
	carte card;

	public facturationAvecCarte(float montant, payement payment, carte card) {
		super(montant, payment);
		this.card = card;

	}

	
	 
}
