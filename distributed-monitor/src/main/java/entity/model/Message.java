package entity.model;

public class Message {

	private int id;
	private int credittransmitting;
	private int creditreceive;
	private int debittransmitting;
	private int debitreceive;
	private int thirdtransmitting;
	private int thirdreceive;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCredittransmitting() {
		return credittransmitting;
	}
	public void setCredittransmitting(int credittransmitting) {
		this.credittransmitting = credittransmitting;
	}
	public int getCreditreceive() {
		return creditreceive;
	}
	public void setCreditreceive(int creditreceive) {
		this.creditreceive = creditreceive;
	}
	public int getDebittransmitting() {
		return debittransmitting;
	}
	public void setDebittransmitting(int debittransmitting) {
		this.debittransmitting = debittransmitting;
	}
	public int getDebitreceive() {
		return debitreceive;
	}
	public void setDebitreceive(int debitreceive) {
		this.debitreceive = debitreceive;
	}
	public int getThirdtransmitting() {
		return thirdtransmitting;
	}
	public void setThirdtransmitting(int thirdtransmitting) {
		this.thirdtransmitting = thirdtransmitting;
	}
	public int getThirdreceive() {
		return thirdreceive;
	}
	public void setThirdreceive(int thirdreceive) {
		this.thirdreceive = thirdreceive;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Message ["
				+"credittransmitting="+credittransmitting
				+",creditreceive="+creditreceive
				+",debittransmitting="+debittransmitting
				+",debitreceive="+debitreceive
				+",thirdtransmitting="+thirdtransmitting
				+",thirdreceive="+thirdreceive
				+"]";
	}
	

	

}
