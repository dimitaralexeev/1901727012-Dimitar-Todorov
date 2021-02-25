package uni.fmi.hmqt.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import uni.fmi.hmqt.model.Seat;

/**
 * Test class for {@link TheaterService}
 * @author Dimitar
 *	
 */
public class TheaterServiceTest {
	private TheaterService ts;
	
	@Before
	public void setup() {
		ts = new TheaterService();
	}
	
	/**
	 * test {@link TheaterServiceTest#generateSeatPlan(int, int)} with 0 or negative value. 
	 * Expected null object for not valid entries.
	 *
	 */
	@Test
	public void testGenerateSeatPlanWithWrongRowCount() {

		final ArrayList<ArrayList<Seat>> result = ts.generateSeatPlan(0, 10);
		
		assertEquals(null, result);
	}
	
	/**
	 * test {@link TheaterServiceTest#generateSeatPlan(int, int)} with 0 or negative value. 
	 * Expected null object for not valid entries.
	 *
	 */
	@Test
	public void testGenerateSeatPlanWithWrongSeatCount() {

		final ArrayList<ArrayList<Seat>> result = ts.generateSeatPlan(5, -2);
		
		assertEquals(null, result);
	}
	
	/**
	 * test {@link TheaterServiceTest#generateSeatPlan(int, int)} with 0 or negative value. 
	 * Expected null object for not valid entries.
	 *
	 */
	@Test
	public void testGenerateSeatPlanWithWrongEntryValues() {

		final ArrayList<ArrayList<Seat>> result = ts.generateSeatPlan(0, -1);
		
		assertEquals(null, result);
	}
}
