
public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		carte c = new carteAirmiles("Bilal","123 avenue 4", 500);
//		payement pDebit = new payementParDebit();
		payement pCash = new payementParCash();
		recompense r = new recompenseAirmilesCash();
		
		
//		facturation f = new facturationSansCarte(1000,pDebit);
		facturation f2 = new facturationCarteAvecRecompense(1000,pCash,c,r);
//		pDebit.payer(f);
		pCash.payer(f2);
		System.out.println(c);
	}

}
