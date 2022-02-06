package oops;

public class DemoHybrid{
	
	public static void main(String[] args) {
		Gpay pay=new Gpay();
		pay.setHolder("vasanth");pay.setBalance(899999.3);pay.setNumber(9876556789L);
		pay.transfer("badri@bankofbaroda", 12800);
		System.out.println(pay.deposit(15000));
		pay.withdraw(100000);
		pay.balance();
	}

}

class Gpay extends Banking implements wallet{

	@Override
	public double deposit(int amount) {
		// TODO Auto-generated method stub
		setBalance(getBalance()+amount);
		System.out.println(amount+" has deposited @ "+getNumber());
		return getBalance();
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if(getBalance() >= amount) {
			setBalance(getBalance()-amount);
			System.out.println(amount+" has withdrawn successfully from "+getNumber());
		}
		else {
			System.out.println(amount+" is insufficient with account balance "+getNumber());
		}
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println(getBalance()+" is available in your "+getNumber()+" of "+getHolder());
		
	}

	@Override
	public void transfer(String upi, int amt) {
		// TODO Auto-generated method stub
		if(getBalance()>=amt)
		{
			setBalance(getBalance()-amt);
			System.out.println(amt+" has been transferred to "+ upi +" successfully from "+getNumber());
		}
		else
		{
			System.out.println(amt+" is insufficient account balance in "+getNumber());
		}
	}
	
}

interface wallet extends BankProcess{
	public void transfer(String upi, int amt);
}

interface BankProcess{
	public double deposit(int amount);
	public void withdraw(int amount);
	public void balance();
}


class Banking{
	
	private String holder;
	private long number;
	private double balance;
	
	public Banking() {
		super();
	}

	/**
	 * @param holder
	 * @param number
	 * @param balance
	 */
	public Banking(String holder, long number, double balance) {
		super();
		this.holder = holder;
		this.number = number;
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
