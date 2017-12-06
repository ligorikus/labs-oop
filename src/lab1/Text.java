package lab1;

public class Text {
	
	private String text;
	/**
	 * Getter text
	 * @return String text
	 */
	public String getText() {
		return text;
	}
	/**
	 * Setter text
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * Install text parameter
	 * @param text
	 */
	public void init(String text)
	{
		this.text = text;
	}
	/**
	 * Clear the text parameter
	 */
	public void clear()
	{
		String result = ""; 
		char symbol;
		for (int i = 0; i < text.length(); i++) {
			symbol = this.text.charAt(i);
			if(symbol >= 'a' && symbol <= 'z' || symbol >= 'à' && symbol <= 'ÿ' || symbol == ' ')
			{
				result += symbol;
			}
		}
		this.text = result;
	}
}
