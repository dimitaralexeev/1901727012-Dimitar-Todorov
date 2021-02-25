/**
 * 
 */
package uni.fmi.hmqt.model;

/**
 * Main Customer data model. Provide main customer information
 * @author Dimitar
 *
 */
public class Customer {
	
	private int id;
	
	private String name;
	
	private int selectedRow;
	
	private int selectedSeat;

	public Customer(String name, int selectedRow, int selectedSeat) {
		this.name = name;
		this.selectedRow = selectedRow;
		this.selectedSeat = selectedSeat;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the customer id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the customer name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the selected row number
	 */
	public int getSelectedRow() {
		return selectedRow;
	}
	
	/**
	 * @param selectedRow the selectedRow to set
	 */
	public void setSelectedRow(int selectedRow) {
		this.selectedRow = selectedRow;
	}
	
	/**
	 * @return the selected seat number
	 */
	public int getSelectedSeat() {
		return selectedSeat;
	}
	
	/**
	 * @param selectedSeat the selectedSeat to set
	 */
	public void setSelectedSeat(int selectedSeat) {
		this.selectedSeat = selectedSeat;
	}
}	
