package KahveDukkaniDemo.adapters;

import KahveDukkaniDemo.business.abstracts.CustomerCheckService;
import KahveDukkaniDemo.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	public boolean CheckIfRealPerson(Customer customer) throws Exception {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		return proxy.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName().toUpperCase()
				, customer.getLastName().toUpperCase(),customer.getDateOfBirth());
		
	}

}
