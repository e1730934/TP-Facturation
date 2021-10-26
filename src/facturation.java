
public abstract class facturation {

	float montant;
	payement payment;
	
	public facturation(float montant, payement payment) {
		super();
		this.montant = montant;
		this.payment = payment;
	}

}
