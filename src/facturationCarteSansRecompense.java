
public class facturationCarteSansRecompense extends facturationAvecCarte {

	public facturationCarteSansRecompense(float montant, payement payment, carte card) {
		super(montant, payment, card);
		// TODO Auto-generated constructor stub
	}

	 void facturer(float montant, payement p, carte c)
		{
			// TODO Auto-generated method stub
			p.payer(this);
			
		}
}
