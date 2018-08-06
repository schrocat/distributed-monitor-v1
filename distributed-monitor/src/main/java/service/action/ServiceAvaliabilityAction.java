package service.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import json.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.model.Serviceprovider;
import service.implement.ServiceAvaliabilityServiceImpl;

@Controller
public class ServiceAvaliabilityAction {
	@RequestMapping("/Service")
	public void getAviliableService(HttpServletRequest request,HttpServletResponse response){
		List<Serviceprovider> list = new ServiceAvaliabilityServiceImpl().getAviliableService();
		ListObject listObject = new ListObject();
		listObject.setValues(list);
		listObject.setCode(StatusCode.CODE_SUCCESS);
		listObject.setMsg("SUCCESS");
		ResponseUtils.renderJson(response, JackJsonUtils.toJson(listObject));
	}
}
