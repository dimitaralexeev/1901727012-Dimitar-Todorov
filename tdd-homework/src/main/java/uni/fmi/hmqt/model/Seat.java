/**
 * 
 */
package uni.fmi.hmqt.model;

/**
 * @author Dimitar
 *
 */
public class Seat {
	
	private int id;
	
	private boolean isReserved;
	
	public Seat(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isReserved() {
		return isReserved;
	}

	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}
}
