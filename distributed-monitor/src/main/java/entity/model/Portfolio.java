package entity.model;

public class Portfolio {
	
	private String time;
	private int numberofbusiness;
	
	
	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public int getNumberofbusiness() {
		return numberofbusiness;
	}


	public void setNumberofbusiness(int numberofbusiness) {
		this.numberofbusiness = numberofbusiness;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Portfolio ["
				+"time="+time
				+",numberofbusiness="+numberofbusiness
				+"]";
	}




}
