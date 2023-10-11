class Accounting {
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : "+ getVAT());
		System.out.println("Total : "+ getTotal() );
		System.out.println("Expense : "+ getExpense() );
		System.out.println("Income : "+ getIncome());
		System.out.println("Dividend : "+ getdividend1() );
		System.out.println("Dividend : "+ getdividend2() );		
		System.out.println("Dividend : "+ getdividend3() );
	}
	
	private double getdividend1() {
		return getIncome() * 0.5;
	}
	
	private double getdividend2() {
		return getIncome() * 0.3;
	}
	
	private double getdividend3() {
		return getIncome() * 0.2;
	}
	
	private  double getIncome() {
		return valueOfSupply - getExpense();
	}
	
	private double getExpense() {
		return valueOfSupply * expenseRate;
	}
	
	private double getTotal() {
		return valueOfSupply + getVAT();
	}

	private double getVAT() {
		return valueOfSupply * vatRate;
	}

	
}

public class AccountingClassApp {
	
	public static void main(String[] args) {
		//instance
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();	
	
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();		
	}


}
