package intro_to_array_lists;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2  = new JButton();
	public void run() {
		
		
	
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
frame.add(panel);
panel.add(button1);
panel.add(button2);
frame.setSize(500, 100);
frame.setVisible(true);
button1.setText("Add Name");
button2.setText("View Names");
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	}
}
