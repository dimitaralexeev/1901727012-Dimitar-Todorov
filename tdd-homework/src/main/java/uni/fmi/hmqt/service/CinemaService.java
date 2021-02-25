package uni.fmi.hmqt.service;

import java.util.ArrayList;
import java.util.List;

import uni.fmi.hmqt.model.Theater;

public class CinemaService {
	
	private List<Theater> theaters = new ArrayList<Theater>();
	
	public String addTheater(Theater theater){
		String result = null;
		
		if(theater.getSeatPlan().isEmpty())
			return "Не може да създадете кино със зали без места";
		
		theaters.add(theater);
		
		return result;
	}
}
