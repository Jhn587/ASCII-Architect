import java.util.ArrayDeque;

public class Combo{
	private char letter;
	private int padding;
	private ArrayDeque<Character> toPrint = new ArrayDeque<Character>();
	
	public Combo(char letter, char padding, ArrayDeque<Character> toCopy){
		System.out.println(toCopy);
		this.letter = letter;
		this.padding = Integer.parseInt(("" + padding));
		if(toCopy!=null){
			this.toPrint = new ArrayDeque<Character>(toCopy);
		}
		addPaddingToArray();
	}

	public String toString(){
		return ""+this.letter+this.padding;
	
	}
	
	private void addPaddingToArray(){
		for(int i = 0; i < padding; i++){
			Character toAdd = new Character(' ');
			this.toPrint.addFirst(toAdd);
		
		}
	
	}
	
	public int getLength(){
		return toPrint.size();
	
	}
	
	public void toMakeSize(int lengthToBe){
		int toChange = lengthToBe-this.getLength();
		addSpacesToEnd(toChange);
	}
	
	public void addSpacesToEnd(int numberOfSpaces){
		for(int i = 0; i < numberOfSpaces; i++){
			toPrint.addLast(' ');
		}
	}
	
	public Character pop(){
		return this.toPrint.removeLast();
	}
}