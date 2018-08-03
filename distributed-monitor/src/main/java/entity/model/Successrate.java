package entity.model;

public class Successrate {

	private double personsuccessrate;
	private double hotspotsuccessrate;
	private double otherrate;

	public double getPersonsuccessrate() {
		return personsuccessrate;
	}
	public void setPersonsuccessrate(double personsuccessrate) {
		this.personsuccessrate = personsuccessrate;
	}
	public double getHotspotsuccessrate() {
		return hotspotsuccessrate;
	}
	public void setHotspotsuccessrate(double hotspotsuccessrate) {
		this.hotspotsuccessrate = hotspotsuccessrate;
	}
	public double getOtherrate() {
		return otherrate;
	}
	public void setOtherrate(double otherrate) {
		this.otherrate = otherrate;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Successrate ["
				+"personsuccessrate="+personsuccessrate
				+",hotspotsuccessrate="+hotspotsuccessrate
				+",otherrate="+otherrate;
	}
	
	
}
