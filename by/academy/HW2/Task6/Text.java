package by.academy.HW2.Task6;

public class Text {
	private String text;
	private String textNew;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Text(String text) {
		super();
		this.text = text;
	}

	public Text() {
		super();
	}

	public void findLastLettersOfWords() {
		char[] charsFromText = text.toCharArray();
		int counter = 0;
				
		for(int i = 0; i < text.length(); i++) {
			if (charsFromText[i] == ' ') {
				counter++;
			}
		}	
		
		int j = 0;
		char[] charsEndsOfWords = new char[counter + 1];
		for (int i = 0; i < text.length() && j <= counter; i++) {
			if (charsFromText[i] == ' ') {
				charsEndsOfWords[j] = charsFromText[i-1];
				j++;
			}
		}
		
		charsEndsOfWords[counter] = charsFromText[text.length() - 1];
		textNew = String.copyValueOf(charsEndsOfWords);
	}
	
	@Override
	public String toString() {
		return textNew;
	}
	
}
