package tasks;

public class Words {
	private char[] letters = {};
	
	public Words(char[] letters) {
		this.letters = letters;
	}
	
	boolean contains(char symbol) {
		for(int i=0; i<this.letters.length; i++) {
			if(this.letters[i]==symbol)
				return true;
		}
		return false;				
		//checks if contains symbol
	}
	
	int length() {
		return this.letters.length;
		//returns size of an array
	}
	
	char[] getLetters() {
		return null;
		//getter
	}
}
