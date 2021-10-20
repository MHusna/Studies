package WordDesigner;

public class Designer {

	String design(String word) {
		int lengthOfWord = word.length();
		int iter = 0;
		String newWord = "";
		
		for(; iter < lengthOfWord; iter++) {
			if(iter == 0) {
				newWord += "*"+word.charAt(iter)+"*";
			}
			else{
				newWord += word.charAt(iter)+"*";
			}
		}
		return newWord;
	}
}
