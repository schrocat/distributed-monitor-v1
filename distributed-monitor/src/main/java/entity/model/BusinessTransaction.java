package entity.model;

public class BusinessTransaction {

	private double individualaccount;
	private double hotaccount;
	private double nothotaccount;
	
	
	public double getIndividualAccount() {
		return individualaccount;
	}


	public void setIndividualAccount(double individualAccount) {
		this.individualaccount = individualAccount;
	}


	public double getHotAccount() {
		return hotaccount;
	}


	public void setHotAccount(double hotAccount) {
		this.hotaccount = hotAccount;
	}


	public double getNotHotAccount() {
		return nothotaccount;
	}


	public void setNotHotAccount(double notHotAccount) {
		this.nothotaccount = notHotAccount;
	}


	public BusinessTransaction() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BusinessTransaction ["
				+ "individualAccount="+individualaccount
				+",hotAccount="+hotaccount
				+",notHotAccount="+nothotaccount
				+"]";
	}

}
