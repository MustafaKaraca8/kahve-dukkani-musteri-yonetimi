package KahveDukkaniDemo.business.abstracts;

import KahveDukkaniDemo.entities.concretes.Customer;

public interface CustomerService {

	void save (Customer customer) throws  Exception;
}
