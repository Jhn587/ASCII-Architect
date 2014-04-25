public class Combo{
	private char letter;
	private int padding;
	private ArrayDeque<Character> toPrint;
	
	public Combo(char letter, char padding, ArrayDeque<Character> toCopy){
		this.letter = letter;
		this.padding = Integer.parseInt(("" + padding));
		this.toPrint = new ArrayDeque<Character>(toCopy);
		addPaddingToArray();
	}

	public String toString(){
		return ""+this.letter+this.padding;
	
	}
	
	private void addPaddingToArray(){
		
	
	}
}