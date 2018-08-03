package json.util;

import java.util.Date;

public class AbstractJsonObject {

	private String code;
	private String msg;
	private long time = new Date().getTime();
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	
	public void setContent(String code,String msg){
		this.code = code;
		this.msg = msg;
	}
	
	public void setStatusObject(StatusObject statusObject){
		this.code = statusObject.getCode();
		this.msg = statusObject.getMsg();
	}


}
