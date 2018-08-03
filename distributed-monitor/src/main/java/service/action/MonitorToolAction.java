package service.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MonitorToolAction {
	@RequestMapping(value="/data.do", method=RequestMethod.POST)
	public void getdata(HttpServletRequest request,HttpServletResponse response){
		int type=0;
		type = Integer.parseInt(request.getParameter("type"));
		switch(type){
		case 1:
			new ServiceAvaliabilityAction().getAviliableService(request, response);
			break;
		default:
			new ErrorAction().getError(request, response);
			break;
		}
	}
	


}
