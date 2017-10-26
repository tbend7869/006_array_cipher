Julius Caesar (Roman General) is credited with out first "cipher."

This is a shift cipher, where each alpha is shifted by the same number. For example,

key = 1
A --> B, B --> C etc

to decipher, reverse the process:
B - 1 --> A, C-key becomes B
------------------------------------------------


------------ CLASS BeginHere -------------------



-------------------------------------------------



------------ CLASS CaesarCipher -----------------


		//System.out.println("test, alpha length = " + alpha.length());
		//System.out.println("test, first char is: " + alpha.charAt(0));
		//System.out.println("test, last char is: " + alpha.charAt(alpha.length()-1));
		
		/*
		for(int i = 0; i < alpha.length(); i++) {
			System.out.println(alpha.charAt(i));
		}
		System.out.println("\n\n");
		
		for (int i = 0; i < plainText.length(); i++) {
			
			System.out.println(plainText.charAt(i));
		}
		*/
		/*
		 * each char that I read from plainText I find the index in alpha
		 * for example, read A look up index for A get 0
		 * 				read M look up index for M get 12
		 * then, add keey to that index, so A index 0 become 0 + key,
		 * and 0+key becomes my coded char
		 * let's say key = 1, then A index 0, 0 + 1 = 1, charAt 1 is B
		 * and that is my encoding
		 */
		 index = alpha.indexOf(plainText.charAt(i));
			//System.out.println("index = " + index);
			/** Doug's Method **/
			keyAdded = (index + key) % alpha.length();
			/** Will's Method
			keyAdded = index + key;

			if (keyAdded >= alpha.length()) {
				keyAdded -= alpha.length();
			}
			**/
			if (keyAdded == 27)
				keyAdded = 26;
			//System.out.println("encoded is " + alpha.charAt(keyAdded));
			secretText += alpha.charAt(keyAdded);
			
		