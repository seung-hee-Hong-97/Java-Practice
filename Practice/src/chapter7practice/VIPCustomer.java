package chapter7practice;

public class VIPCustomer extends Customer{

	private int agentID;
	public double salesRatio;
	
	public VIPCustomer(String name) {
		this.customerName= name;
		
		customerGrade= "VIP";
		bonusRatio= 0.05;
		salesRatio= 0.1;
		setAgentID(12345);
	}

	public int calcPrice(int price) {
		bonusPoint+= price * bonusRatio;
		
		return price - (int) (price * salesRatio);
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "점 입니다. 담당 상담원 번호는 "
				+ getAgentID() + "입니다.";
	}
	
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
}
