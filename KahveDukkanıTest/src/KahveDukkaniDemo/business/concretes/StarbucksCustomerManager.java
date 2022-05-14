package KahveDukkaniDemo.business.concretes;

import KahveDukkaniDemo.business.abstracts.BaseCustomerManager;
import KahveDukkaniDemo.business.abstracts.CustomerCheckService;
import KahveDukkaniDemo.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService checkService;
	
	
	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}


	@Override
	public void save(Customer customer) throws Exception {
		
		if(checkService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			throw new Exception("Not a valid person");
		}
	}
}
