package Exercise1;
public class Account {
	String id;
	String name;
	int balance = 0;
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	String getID() {
		return id;
	}
	
	String getName() {
		return name;
	}
	
	int getBalance() {
		return balance;
	}
	
	int credit(int amount) {
		return balance+=amount;
	}
	
	int debit(int amount) {
		if(amount<=balance) {
			balance-=amount;
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}

	int transferTo(Account x, int amount) {
		if(amount<=balance) {
			System.out.println("Amount transferred!");
			x.balance=amount;
		}
		else {
			System.out.println("Amount exceeded balance");
			return this.balance;
		}
		return x.balance;
	}
	@Override
	public String toString() {
		return "Account[id:"+this.id+" name:"+this.name+", balance:"+this.balance+"]";
	}
	public static void main(String[] args) {
		Account a = new Account("abc", "ramesh", 5000);
		Account b = new Account("xyz", "ram");
		//getting a balance
		System.out.println(a.getBalance());
		//credit 100 to a
		System.out.println(a.credit(100));
		//debit 1000 from a
		System.out.println(a.debit(1000));
		//check b balance
		System.out.println(b.getBalance());
		//transferring 2000 from a to b
		System.out.println(a.transferTo(b,2000));
		//check b balance
		System.out.println(b.getBalance());
		//credit 20 to b
		System.out.println(b.credit(20));
		//debit 500 from b
		System.out.println(b.debit(500));
		//check b balance
		System.out.println(b.getBalance());
		//check exceeded amount condition
		System.out.println(b.transferTo(a,2000));


	}

}

//Output:

//	5000
//	5100
//	4100
//	0
//	Amount transferred!
//	2000
//	2000
//	2020
//	1520
//	1520
//	Amount exceeded balance
//	1520
	
