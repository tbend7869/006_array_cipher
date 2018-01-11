package caesar;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BeginHere {

	public static void main(String[] args) {

		
		/* Doug's example of drop-down JOP,with adds by Mr. M*/
		//Object is top class in Java, used when you are not sure what type might
		// using a String, int, class object, or what? -- so use Object [] array to
		Boolean StopLoop = false;
		String msg = "";
		
		
		while(StopLoop == false) {
			String plainText = "";
			int key = 0;
			String codedTExt = "";
			
			
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
		
		CaesarCipher myCipher = new CaesarCipher();
		switch (selection) { // switch on string allowed in Java 7 and higher
		case "Encoder":
			msg = "Please enter the plain text to encode: ";
			String plainText = JOptionPane.showInputDialog(msg).toLowerCase();
			//String plainText = kbd.nextLine().toLowerCase();
			msg = "Please enter the key: ";
			int key = Integer.parseInt(JOptionPane.showInputDialog(msg));
			//int key = kbd.nextInt();
			//System.out.println("Your key is: " + key);
			String codedText = myCipher.encode(plainText, key);
			JOptionPane.showMessageDialog(null, "Your encoded message is: " + codedText);
			break;
			//break means all done, leave the switch block - almost always use break
			//if no break, execution continues for all remaining cases
		case "Decoder":
			msg = "Please enter the encoded to text to decode: ";
			codedText = JOptionPane.showInputDialog(msg).toLowerCase();
			msg = "Please enter the key: ";
			key = Integer.parseInt(JOptionPane.showInputDialog());
			String decodedText = myCipher.decode(codedText, key);
			JOptionPane.showMessageDialog(null, "Your encoded message is: " + decodedText);
			break;
		case "Cracker":
			msg= "Please enter the encoded text to crack: ";
			codedText = JOptionPane.showInputDialog(msg).toLowerCase();
			int crackedKey = myCipher.crack(codedText);
			JOptionPane.showMessageDialog(null, "Your key is: " + crackedKey);
			break;
		case "Exit":
			System.exit(0);
			break;
		default:
			JOptionPane.showMessageDialog(null, "I don't understand. Please try again.");
		}
		}
		//after the 'break' continue with the following code
		
		//OK, back to our earlier code ...
		/*
		String msg = "Would you like to encode a plain text message?";
		int confirm = JOptionPane.showConfirmDialog(null, msg);
		Scanner kbd = new Scanner(System.in);
		*/
		
		
		
		
		

	}

}
