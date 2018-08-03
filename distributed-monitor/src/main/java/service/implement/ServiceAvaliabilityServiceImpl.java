package service.implement;

import java.util.List;

import entity.model.Serviceprovider;
import service.api.ServiceAvaliabilityService;
import service.business.ServiceAvalibilityBusiness;

public class ServiceAvaliabilityServiceImpl implements ServiceAvaliabilityService {
	public List<Serviceprovider> getAviliableService() {
		return ServiceAvalibilityBusiness.getAviliableService();
	}
}
