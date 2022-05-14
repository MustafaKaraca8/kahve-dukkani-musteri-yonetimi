package KahveDukkaniDemo.business.concretes;

import KahveDukkaniDemo.business.abstracts.CustomerCheckService;
import KahveDukkaniDemo.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
	
		return true;
	}

}
