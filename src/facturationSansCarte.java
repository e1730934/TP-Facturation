
public class facturationSansCarte extends facturation {

	public facturationSansCarte(float montant, payement payment) throws Exception {
		super(montant, payment);
		 if (payment instanceof payementParPoint) {
	            throw new Exception("Le payement ne peut pas �tre par point puisque le client n'a pas pr�sent� une carte de client");
	        } else {
	            this.montant = montant;
	            this.payment = payment;
	            System.out.println("Le payement par " + payment + " a �t� selectionn� avec succ�s ");
	            }

	}


	void facturer() {
		// TODO Auto-generated method stub
		this.payment.payer(this);
	}
	
	


}
