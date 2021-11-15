
public class facturationSansCarte extends facturation {

	public facturationSansCarte(float montant, payement payment) throws Exception {
		super(montant, payment);
		 if (payment instanceof payementParPoint) {
	            throw new Exception("Le payement ne peut pas être par point puisque le client n'a pas présenté une carte de client");
	        } else {
	            this.montant = montant;
	            this.payment = payment;
	            }

	}


	void facturer() {
		// TODO Auto-generated method stub
		this.payment.payer(this);
	}
	
	


}
