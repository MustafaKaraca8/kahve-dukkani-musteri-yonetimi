package KahveDukkaniDemo.test;

import KahveDukkaniDemo.adapters.MernisServiceAdapter;
import KahveDukkaniDemo.business.abstracts.BaseCustomerManager;
import KahveDukkaniDemo.business.concretes.StarbucksCustomerManager;
import KahveDukkaniDemo.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Customer kisi_1 = new Customer(1,"Mustafa","Karaca",335271368,2002);
		
		BaseCustomerManager manager1= new StarbucksCustomerManager(new MernisServiceAdapter());
		manager1.save(kisi_1);
	
	}

}
