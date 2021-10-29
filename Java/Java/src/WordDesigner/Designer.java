package WordDesigner;

public class Designer {

	String design(String word, String specialChar) {
		int lengthOfWord = word.length();
		int iter = 0;
		String newWord = "";
		
		for(; iter < lengthOfWord; iter++) {
			if(iter == 0) {
				newWord += "*"+word.charAt(iter)+specialChar;
			}
			else{
				newWord += word.charAt(iter)+specialChar;
			}
		}
		return newWord;
	}
}
