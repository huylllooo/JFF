package targetHeartRateCalculator;
import java.util.Calendar;
import java.lang.*;

public class HeartRates {
	// class attributes 
	private String firstName;
	private String lastName;
	private String dayOfBirth;

	// constructor
	public HeartRates(String fName,String lName,String bDay) {
		firstName = fName;
		lastName = lName;
		dayOfBirth = bDay;
	}
	// attribute set and get methods
	public void setFirstName(String fName) {
		firstName = fName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String lName) {
		lastName = lName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setDayOfBirth(String bDay) {
		dayOfBirth = bDay;
	}
	public String getDayOfBirth() {
		return dayOfBirth;
	}
	
	// calculates person's age
	public int age() {
		return Calendar.getInstance().get(Calendar.YEAR)
				- Integer.parseInt(dayOfBirth.substring(7));
	}
	// calculates person's max health rate
}
