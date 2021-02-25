/**
 * 
 */
package uni.fmi.hmqt.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import uni.fmi.hmqt.model.Seat;
import uni.fmi.hmqt.model.Theater;

/**
 * @author Dimitar
 *
 */
public class CinemaServiceTest {
	
	private CinemaService cs;
	
	@Before
	public void setup() {
		cs = new CinemaService();
	}
	
	/**
	 * test {@link CinemaServiceTest#addTheater(Theater)} with List. 
	 * Expected message for empty seat plan.
	 *
	 */
	@Test
	public void testAddTheaterWithEmptySeatPlan() {
		Theater theater = new Theater();
		theater.setSeatPlan(new ArrayList<ArrayList<Seat>>());
		final String result = cs.addTheater(theater);
		
		assertEquals("Не може да създадете кино със зали без места", result);
	}
}
