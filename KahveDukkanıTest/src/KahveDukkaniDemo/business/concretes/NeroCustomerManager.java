package KahveDukkaniDemo.business.concretes;

import KahveDukkaniDemo.business.abstracts.BaseCustomerManager;
import KahveDukkaniDemo.entities.concretes.Customer;


public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) throws Exception {
		super.save(customer);
		
	}
	
}
