package caesar;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BeginHere {

	public static void main(String[] args) {

		
		/* Doug's example of drop-down JOP,with adds by Mr. M*/
		//Object is top class in Java, used when you are not sure what type might
		// using a String, int, class object, or what? -- so use Object [] array to
		Boolean StopLoop = false;
		
		while(StopLoop == false) {
		Object[] selectionsArray = {"Encoder", "Decoder", "Cracker", "Exit"};
		String showFirst = "Encoder";
		String selection = (String) JOptionPane.showInputDialog(
							null,
							"Message: Select a Utility:",
							"Title: Doug's Example",
							JOptionPane.PLAIN_MESSAGE,
							null,
							selectionsArray,
							showFirst);
		if (selection == null) selection = "Cancelled";
		JOptionPane.showMessageDialog(null, "You have selected: " + selection);
		
		switch (selection) { // switch on string allowed in Java 7 and higher
		case "Encoder":
			JOptionPane.showMessageDialog(null,
					"We are now in the Encoder switch block - add some code!");
			break;
			//break means all done, leave the switch block - almost always use break
			//if no break, execution continues for all remaining cases
		case "Decoder":
			JOptionPane.showMessageDialog(null,
					"We are now in the Decoder switch block - add some code!");
			break;
		case "Cracker":
			JOptionPane.showMessageDialog(null,
					"We are now in the Cracker switch block - add some code!");
			break;
		case "Exit":
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null,
					"We are now in the Unknown Case or Cancelled switch block - what do you want to do?");
		}
		}
		//after the 'break' continue with the following code
		
		//OK, back to our earlier code ...
		String msg = "Would you like to encode a plain text message?";
		int confirm = JOptionPane.showConfirmDialog(null, msg);
		Scanner kbd = new Scanner(System.in);
		
		
		CaesarCipher myCipher = new CaesarCipher();
		
		
		msg = "Please enter the plain text to encode.";
		String plainText = JOptionPane.showInputDialog(msg).toLowerCase();
		//String plainText = kbd.nextLine().toLowerCase();
		
		msg = "Please enter the key: ";
		int key = Integer.parseInt(JOptionPane.showInputDialog(msg));
		//int key = kbd.nextInt();
		//System.out.println("Your key is: " + key);
		
		String codedText = myCipher.encode(plainText, key);
		
		JOptionPane.showMessageDialog(null, "Your secret message is: " + codedText);

	}

}
