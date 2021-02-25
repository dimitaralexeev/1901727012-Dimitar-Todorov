/**
 * 
 */
package uni.fmi.hmqt.service;

import java.util.ArrayList;

import uni.fmi.hmqt.model.Seat;

/**
 * @author Dimitar
 *
 */
public class TheaterService {
	
	/**
	 * Provide generating of the seat plan functionality. Expected rowCount, seatCount.
	 * 
	 * @param rowCount    represent how many rows the theater has. Valid not {@code 0} or negative int.
	 * 
	 * @param seatCount    represent how many seats the theater has. Valid not {@code 0} or negative int.
	 *                 
	 * @return nested ArrayList<> of rows and seats if generating is successful.
	 */
	public ArrayList<ArrayList<Seat>> generateSeatPlan(int rowCount, int seatCount){

		ArrayList<ArrayList<Seat>> seatPlan = new ArrayList<ArrayList<Seat>>();
		
		if(rowCount <= 0 || seatCount <= 0) {

			return null;
		}
		
		for(int i = 0; i < rowCount; i++) {
			seatPlan.add(new ArrayList<Seat>());
		}
		
		for(ArrayList<Seat> seats : seatPlan) {
			for(int i = 0; i < seatCount; i++) {
				seats.add(new Seat(i));
			}
		}
		
		return seatPlan;
	}
	
	
}
