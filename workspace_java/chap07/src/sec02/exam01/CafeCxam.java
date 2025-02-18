package sec02.exam01;

public class CafeCxam {

	public static void main(String[] args) {

		
		Barista barista = new Barista();
		Cashier cashier = new Cashier();
		Welfare w = new Welfare();
		w.salary(barista,100);
		w.salary(cashier,123);
		
		barista.printMoney();
		cashier.printMoney();
	}

}
