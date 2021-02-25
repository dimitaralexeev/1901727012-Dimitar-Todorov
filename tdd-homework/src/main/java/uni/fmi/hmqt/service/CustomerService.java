/**
 * 
 */
package uni.fmi.hmqt.service;

import java.util.ArrayList;

import uni.fmi.hmqt.model.Customer;

/**
 * @author Dimitar
 *
 */
public class CustomerService {
	
	private ArrayList<Customer> listOfReservations = new ArrayList<Customer>();
	
	/**
	 * Provide generating of the seat plan functionality. Expected rowCount, seatCount.
	 * 
	 * @param customer    represent the customer object. Valid not {@code null}
	 *              
	 * @return String information if the customer is added to the reservation list.
	 */ 
	public String addCustomer(Customer customer) {
		String result = null;
		
		if(customer == null) 
			return result = "Не може да въвждате празен клиент";
		
		if(customer.getName() == "" || customer.getSelectedRow() <= 0 || customer.getSelectedSeat() <= 0)
			return result = "Не може  да въведете клиент без име или избрано място";
		
		listOfReservations.add(customer);
		
		return result;
	}
}
