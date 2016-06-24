package targetHeartRateCalculator;
import javax.swing.JOptionPane;

public class TargetHRCal {

	public static void main(String[] args) {
		String fName = 
				JOptionPane.showInputDialog("What is your first name?");
		String lName =  
				JOptionPane.showInputDialog("What is your last name?");
		String bDay = 
				JOptionPane.showInputDialog("Please enter your day of birth (dd-mmm-yyyy)");
		HeartRates user = new HeartRates(fName, lName, bDay);
		user.age();
		user.maxHR();
		user.calculateTHR();
		String message = 
				String.format("Hi %s %s\n" +
						"Date of birth: %s (%d years old)\n" +
						"Maximum heart rate: %d\n" +
						"Target-heart-rate: %d-%d", 
						user.getFirstName(), user.getLastName(),
						user.getDayOfBirth(),
						user.age(),
						user.maxHR(),user.getMinTHR(),user.getMaxTHR());
		
		JOptionPane.showMessageDialog(null, message);
	}

}
