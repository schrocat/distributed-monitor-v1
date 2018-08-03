package service.api;

import java.util.List;

import entity.model.BusinessTransaction;

public interface BusinessStatisticService {
	public List<BusinessTransaction> getAllTransaction();
}
