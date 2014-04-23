public class Combo{
	private char letter;
	private int padding;
	
	public Combo(char letter, char padding){
		this.letter = letter;
		this.padding = Integer.parseInt(("" + padding));
	}

	public String toString(){
		return ""+this.letter+this.padding;
	
	}
}