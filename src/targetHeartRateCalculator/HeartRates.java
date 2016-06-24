package targetHeartRateCalculator;
import java.util.Calendar;
import java.lang.*;

public class HeartRates {
	// class attributes 
	private String firstName;
	private String lastName;
	private String dayOfBirth;
	private int age;
	private int maxHR;
	private int minTHR;
	private int maxTHR;

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
	
	// calculates and returns person's age
	public int age(){
		age = Calendar.getInstance().get(Calendar.YEAR)
				- Integer.parseInt(dayOfBirth.substring(7));
		return age;
	}
	// calculates person's max health rate
	public int maxHR() {
		maxHR = 220 - age;
		return maxHR;
	}
	// calculates target-heart-rate range
	public void calculateTHR() {
		maxTHR = maxHR*85/100;
		minTHR = maxHR*50/100;
	}
	public int getMaxTHR(){
		return maxTHR;
	}
	public int getMinTHR() {
		return minTHR;
	}
}
