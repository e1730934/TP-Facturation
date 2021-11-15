
public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		carte cAirmiles1 = new carteAirmiles("Bilal","123 avenue 4", 500);
		carte cPoint1 = new cartePoint("Bilal", "456 avenue 5", 10);
		payement pPoint = new payementParPoint();
		payement pDebit = new payementParDebit();
		payement pCash = new payementParCash();
		recompense rAirCash = new recompenseAirmilesCash();
		recompense rPoint = new recompensePointCash();
		
		
		
		facturation f = new facturationSansCarte(1000,pDebit);
		facturationAvecCarte f2 = new facturationCarteAvecRecompense(1000,pCash,cAirmiles1,rAirCash);
		facturationAvecCarte f3 = new facturationCarteAvecRecompense(5000,pPoint,cPoint1,rPoint);
		
		pDebit.payer(f);
		pCash.payer(f2);
		pPoint.payer(f3);
		
		
		rAirCash.recompenser(f2);
		rPoint.recompenser(f3);
		System.out.println(cAirmiles1);
		System.out.println(cPoint1);
	}

}
