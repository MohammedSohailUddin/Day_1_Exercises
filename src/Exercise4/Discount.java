package Exercise4;

import java.util.Date;

public class Discount {
	double serviceDiscountPremium = 0.2;
	double serviceDiscountGold = 0.15;
	double serviceDiscountSilver = 0.1;
	double productDiscountPremium = 0.1;
	double productDiscountGold = 0.1;
	double prductDiscountSilver = 0.1;
	double getServiceDiscountRate() {
		return 0;
		
	}
	double getProductDiscountRate() {
		return 0;
		
	}
	class Customer{
		String name;
		boolean member=false;
		String memberType;
		
		public Customer(String name) {
			this.name = name;
		}
		String getName() {
			return name;
		}
		boolean isMember() {
			return member;
			
		}
		void setMember(boolean member) {
			this.member = member;
		}
		String getMemberType(){
			return memberType;
			
		}
		void setMemberType(String type) {
			
		}
	}
	
	class Visit extends Customer{
		public Visit(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}
		Customer customer;
		Date date;
		double serviceExpense;
		double productExpense;
		
//		public Visit(String n, Date d) {
//			this.name = n;
//			this.date = d;
//		}
		String getName() {
			return name;
		}
		double getServiceExpense() {
			return 0;
		}
		void setServiceExpense(double ex) {
			return;
		}
		double getProductExpense() {
			return 0;
			
		}
		void setProductExpense(double ex) {
			return;
		}
		double getTotalExpense(){
			return 0;
		}
		
	}
}

//Output:
	