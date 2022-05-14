package KahveDukkaniDemo.business.abstracts;

import KahveDukkaniDemo.entities.concretes.Customer;

public interface CustomerCheckService {

	boolean CheckIfRealPerson(Customer customer) throws  Exception;
}
