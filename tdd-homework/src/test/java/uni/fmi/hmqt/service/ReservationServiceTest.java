/**
 * 
 */
package uni.fmi.hmqt.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import uni.fmi.hmqt.model.Movie;

/**
 * Test class for {@link ReservationService}
 * @author Dimitar
 *	
 */
public class ReservationServiceTest {
	private ReservationService reservationService;
	
	@Before
	public void setup() {
		reservationService = new ReservationService(new Movie(1, "movie1", 18, 1));
	}
	
	/**
	 * test {@link ReservationServiceTest#doReservation(String, String, String, String, int)} with null or 0 entries. 
	 * Expected message for not valid entries.
	 *
	 */
	@Test
	public void testReservationWithEmptyEntries() {

		final String result = reservationService.doReservation(null, null, 0, 0, 0);
		
		assertEquals("Въведете валидни параметри за резервация!", result);
	}
	
	/**
	 * test {@link ReservationServiceTest#doReservation(String, String, int, int, int)} with null customer name. 
	 * Expected message for not valid entries.
	 *
	 */
	@Test
	public void testReservationWithEmptyCustomerName() {

		final String result = reservationService.doReservation(null, reservationService.getMovie().getTitle(), 2, 5, 14);
		
		assertEquals("Въведете валидни параметри за резервация!", result);
	}
	
	/**
	 * test {@link ReservationServiceTest#doReservation(String, String, int, int, int)} with null movie title. 
	 * Expected message for not valid entries.
	 *
	 */
	@Test
	public void testReservationWithEmptyMovieTitle() {

		final String result = reservationService.doReservation("customer", null, 2, 5, 14);
		
		assertEquals("Въведете валидни параметри за резервация!", result);
	}
	
	/**
	 * test {@link ReservationServiceTest#doReservation(String, String, int, int, int)} with wrong row number. 
	 * Expected message for not valid entries.
	 *
	 */
	@Test
	public void testReservationWithWrongRowNumber() {

		final String result = reservationService.doReservation("customer", reservationService.getMovie().getTitle(), 0, 5, 14);
		
		assertEquals("Въведете валидни параметри за резервация!", result);
	}
	
	/**
	 * test {@link ReservationServiceTest#doReservation(String, String, int, int, int)} with wrong seat number. 
	 * Expected message for not valid entries.
	 *
	 */
	@Test
	public void testReservationWithWrongSeatNumber() {

		final String result = reservationService.doReservation("customer", reservationService.getMovie().getTitle(), 2, 0, 14);
		
		assertEquals("Въведете валидни параметри за резервация!", result);
	}
	
	/**
	 * test {@link ReservationServiceTest#doReservation(String, String, int, int, int)} with wrong reservation hour. 
	 * Expected message for not valid entries.
	 *
	 */
	@Test
	public void testReservationWithWrongReservationHour() {

		final String result = reservationService.doReservation("customer", reservationService.getMovie().getTitle(), 2, 5, -1);
		
		assertEquals("Резервацията неуспешна", result);
	}
	
	/**
	 * test {@link ReservationServiceTest#doReservation(String, String, int, int, int)} with wrong reservation hour. 
	 * Expected message for not valid entries.
	 *
	 */
	@Test
	public void testReservationWithHourGreaterThanOneHourBeforeMovie() {

		final String result = reservationService.doReservation("customer", reservationService.getMovie().getTitle(), 2, 5, 17);
		
		assertEquals("Резервацията неуспешна", result);
	}
	
	/**
	 * test {@link ReservationServiceTest#doReservation(String, String, int, int, int)} with already reserved seat. 
	 * Expected message for not valid entries.
	 *
	 */
	@Test
	public void testReservationWithReservedSeat() {
		reservationService.doReservation("customer", reservationService.getMovie().getTitle(), 2, 5, 13);
		final String result = reservationService.doReservation("customer1", reservationService.getMovie().getTitle(), 2, 5, 14);
		
		assertEquals("Резервацията неуспешна", result);
	}
}
