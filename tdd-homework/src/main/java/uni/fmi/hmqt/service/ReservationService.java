/**
 * 
 */
package uni.fmi.hmqt.service;

import java.util.ArrayList;

import uni.fmi.hmqt.model.Customer;
import uni.fmi.hmqt.model.Movie;
import uni.fmi.hmqt.model.Seat;

/**
 * @author Dimitar
 *
 */
public class ReservationService {
	
	private Movie movie;
	
	public ReservationService(Movie movie) {
		this.movie = movie;
	}
	
	TheaterService ts = new TheaterService();
	
	CustomerService cs = new CustomerService();
	
	ArrayList<ArrayList<Seat>> seatPlan = ts.generateSeatPlan(5, 10);
	
	/**
	 * Provide reservation functionality. Expected name, movieTitle, rowNumber, seatNumber, currentTime.
	 * 
	 * @param name	String representation for customer name. Valid not {@code NULL} or
	 *                 empty String
	 * @param movieTitle    represent movie title. Valid not {@code NULL} or empty
	 *                 String
	 * @param rowNumber    represent row number which customer choose. Valid not {@code 0} or negative  value
	 *                
	 * @param seatNumber    represent seat number which customer choose. Valid not {@code 0} or negative value
	 *                 
	 * @param currentTime    represent time when customer has made the reservation. Valid not {@code 0} or negative value
	 *                 
	 * @return String information message if reservation is successful.
	 */
	public String doReservation(String name, String movieTitle, int rowNumber, int seatNumber, int currentTime) {

		if(name == null || movieTitle == null || rowNumber <= 0 || seatNumber <= 0) {
			return "Въведете валидни параметри за резервация!";
		} 
		
		if(currentTime <= 0 || currentTime >= movie.getHour() - 1) {
			return "Резервацията неуспешна";
		}
		
		if(!seatPlan.get(rowNumber).get(seatNumber).isReserved()) {
			return "Резервацията неуспешна";
		}
		
		seatPlan.get(rowNumber).get(seatNumber).setReserved(true);

		cs.addCustomer(new Customer(name, rowNumber, seatNumber));
		
		return "Резервацията е успешна";
	}

	public Movie getMovie() {
		return movie;
	}
}
