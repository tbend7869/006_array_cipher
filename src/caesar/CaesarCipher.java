package caesar;

public class CaesarCipher {
	
	private String alpha = "abcdefghijklmnopqrstuvwxyz0123456789.:'";

	public String encode(String plainText, int key) {
		
		String secretText="";
		int index, keyAdded;
		

		for (int i=0; i<plainText.length(); i++) {
			if (plainText.charAt(i) != 'd') {
  				index = alpha.indexOf(plainText.charAt(i));
  				keyAdded = (index + key) % alpha.length();
  				secretText = secretText + alpha.charAt(keyAdded);
  			} else {
  				secretText = secretText + " ";
  			}
			
		}
		
		return secretText;
		
	}

}
