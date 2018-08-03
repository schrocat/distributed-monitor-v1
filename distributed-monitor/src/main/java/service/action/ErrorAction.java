package service.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import json.util.JackJsonUtils;
import json.util.ListObject;
import json.util.ResponseUtils;
import json.util.StatusCode;
 
public class ErrorAction {
	public void getError(HttpServletRequest request,HttpServletResponse response){
		ListObject listObject = new ListObject();
		listObject.setCode(StatusCode.CODE_ERROR);
		listObject.setMsg("ERROR");
		ResponseUtils.renderJson(response, JackJsonUtils.toJson(listObject));
	}

}
