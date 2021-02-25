/**
 * 
 */
package uni.fmi.hmqt.model;

/**
 * Main Movie data model. Provide main movie information
 * @author Dimitar
 *
 */
public class Movie {
	
	private int id;
	
	private String title;
	
	private int hour;
	
	private int theatreId;

	
	
	public Movie(int id, String title, int hour, int theatreId) {
		this.id = id;
		this.title = title;
		this.hour = hour;
		this.theatreId = theatreId;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the movie id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * @param title the movie title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * @return the theater id
	 */
	public int getTheatreId() {
		return theatreId;
	}
	
	/**
	 * @param theatreId the theater id to set
	 */
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	
	/**
	 * @return the hour
	 */
	public int getHour() {
		return hour;
	}
	
	/**
	 * @param hour the starting movie hour to set
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}
}
