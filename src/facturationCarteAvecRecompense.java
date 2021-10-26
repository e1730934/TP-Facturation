
public class facturationCarteAvecRecompense extends facturationAvecCarte {

	recompense r;
	
	public facturationCarteAvecRecompense(float montant, payement payment, carte card, recompense r) {
		super(montant, payment, card);
		this.r = r;
	}

	void facturer(float montant, payement p, carte c, recompense r) {
		// TODO Auto-generated method stub
		
		this.payment.payer(this);
		this.r.recompenser(this);
	}
	
	
	
}
