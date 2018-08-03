package entity.model;

public class Serviceprovider {

	private String cluster;
	private String servicename;
	private int numberofavaliable;
	private String state;
	public String getCluster() {
		return cluster;
	}
	public void setCluster(String cluster) {
		this.cluster = cluster;
	}
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	public int getNumberofavaliable() {
		return numberofavaliable;
	}
	public void setNumberofavaliable(int numberofavaliable) {
		this.numberofavaliable = numberofavaliable;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Serviceprovider ["
				+"cluster="+cluster
				+",servicename="+servicename
				+",numberofavaliable="+numberofavaliable
				+",state="+state
				+"]";
	}

	

}
