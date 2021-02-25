package uni.fmi.hmqt.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import uni.fmi.hmqt.model.Customer;

/**
 * Test class for {@link CustomerService}
 * @author Dimitar
 *	
 */
public class CustomerServiceTest {
	private CustomerService cs;
	
	@Before
	public void setup() {
		cs = new CustomerService();
	} 
	
	/**
	 * test {@link CustomerServiceTest#addCustomer(Customer)} with null. 
	 * Expected message for not valid entries.
	 *
	 */
	@Test
	public void testAddCustomerWithNullObject() {

		final String result = cs.addCustomer(null);
		
		assertEquals("Не може да въвждате празен клиент", result);
	}
	
	/**
	 * test {@link CustomerServiceTest#addCustomer(Customer)} with empty String name. 
	 * Expected message for not valid entries.
	 *
	 */
	@Test
	public void testAddCustomerWithEmptyCustomerName() {

		final String result = cs.addCustomer(new Customer("", 2, 5));
		
		assertEquals("Не може  да въведете клиент без име или избрано място", result);
	}
	
	/**
	 * test {@link CustomerServiceTest#addCustomer(Customer)} with wrong selectedRow value. 
	 * Expected message for not valid entries.
	 *
	 */
	@Test
	public void testAddCustomerWithWrongRowValue() { 

		final String result = cs.addCustomer(new Customer("customer", 0, 5));
		
		assertEquals("Не може  да въведете клиент без име или избрано място", result);
	}
	
	/**
	 * test {@link CustomerServiceTest#addCustomer(Customer)} with wrong selectedSeat value. 
	 * Expected message for not valid entries.
	 *
	 */
	@Test
	public void testAddCustomerWithWrongSeatValue() {

		final String result = cs.addCustomer(new Customer("customer", 2, -5));
		
		assertEquals("Не може  да въведете клиент без име или избрано място", result);
	}
}
