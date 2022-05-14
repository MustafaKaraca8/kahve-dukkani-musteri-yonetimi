package KahveDukkaniDemo.business.abstracts;

import KahveDukkaniDemo.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) throws  Exception {
		
		System.out.println("Veri dataya eklendi: " + customer.getFirstName());
	}
	
	

}
