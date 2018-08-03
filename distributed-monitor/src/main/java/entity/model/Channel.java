package entity.model;

public class Channel {
	
	private int id;
	private int phone;
	private int enterprise;
	private int liquidation;
	private int counter;
	private int posseivice;
	private int selfservice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getEnterprice() {
		return enterprise;
	}
	public void setEnterprice(int enterprise) {
		this.enterprise = enterprise;
	}
	public int getLiquidation() {
		return liquidation;
	}
	public void setLiquidation(int liquidation) {
		this.liquidation = liquidation;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public int getPosseivice() {
		return posseivice;
	}
	public void setPosseivice(int posseivice) {
		this.posseivice = posseivice;
	}
	public int getSelfservice() {
		return selfservice;
	}
	public void setSelfservice(int selfservice) {
		this.selfservice = selfservice;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Channel ["
				+"id="+id
				+",phone="+phone
				+",enterprise="+enterprise
				+",liquidation="+liquidation
				+",counter="+counter
				+",posseivice="+posseivice
				+",selfservice="+selfservice
				+"]";
	}
	


}
