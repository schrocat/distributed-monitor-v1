package service.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.implement.GetMessageTypeServiceImpl;

@Controller
public class MonitorToolAction {
	@RequestMapping(value="/data.do", method=RequestMethod.GET)
	public void getdata(HttpServletRequest request,HttpServletResponse response){
		int type=0;
		type = Integer.parseInt(request.getParameter("type"));
		switch(type){
		case 1:
			new ServiceAvaliabilityAction().getAviliableService(request, response);
			break;
		case 2:
			new GetSendWayAction().getSendWay(response, request);
			break;
		case 3:
			new GetMessageTypeAction().getMessageType(response, request);;
			break;
		case 4:
		case 5:
			new BusinessRateAction().getBusinessRateService(response, request, type);
			break;
		default:
			new ErrorAction().getError(request, response);
			break;
		}
	}
	


}
