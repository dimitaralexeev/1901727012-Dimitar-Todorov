package uni.fmi.hmqt.model;

import java.util.ArrayList;

/**
 * Main Theater data model. Provide main theater information
 * @author Dimitar
 *
 */
public class Theater {
	
	private int id;
	
	private ArrayList<ArrayList<Seat>> seatPlan = new ArrayList<ArrayList<Seat>>();
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the theater id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the seatPlan
	 */
	public ArrayList<ArrayList<Seat>> getSeatPlan() {
		return seatPlan;
	}
	
	/**
	 * @param seatPlan the seat plan to set
	 */
	public void setSeatPlan(ArrayList<ArrayList<Seat>> seatPlan) {
		this.seatPlan = seatPlan;
	}
}
