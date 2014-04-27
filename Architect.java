import java.util.Deque;
import java.util.HashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Architect {
//a is +
//b is ++
//c is ++-
//d is ++--
//e is ++--*
//f is ++--**
//g is ++--***
//h is ++--***.
//i is ++--***..
//j is ++--***...

	private HashMap<Character, ArrayDeque<Character>> data = new HashMap<Character, ArrayDeque<Character>>();
	private String toConvert;
	private String toReturn;
	private ArrayList<Combo> fromString = new ArrayList<Combo>();
	
	public Architect(String toConvert){
		populateMap();
		this.toConvert = toConvert;
		convert(this.toConvert);
		int maxLength = findMaxLength();
		adjustLength(maxLength);
		for(Combo toTest:this.fromString){
			System.out.println(toTest);
		}
		this.toReturn = makeString(maxLength);
//j is ++--***...
		
	}
	
	private void populateMap(){
		ArrayDeque<Character> forA = new ArrayDeque<>();
		forA.add('+');
		
		ArrayDeque<Character> forB = new ArrayDeque<>();
		forB.add('+');
		forB.add('+');
		
		ArrayDeque<Character> forC = new ArrayDeque<>();
		forC.add('+');
		forC.add('+');
		forC.add('-');
		
		ArrayDeque<Character> forD = new ArrayDeque<>();
		forD.add('+');
		forD.add('+');
		forD.add('-');
		forD.add('-');
		
		ArrayDeque<Character> forE = new ArrayDeque<>();
		forE.add('+');
		forE.add('+');
		forE.add('-');
		forE.add('-');
		forE.add('*');
		
		
		ArrayDeque<Character> forF = new ArrayDeque<>();
		forF.add('+');
		forF.add('+');
		forF.add('-');
		forF.add('-');
		forF.add('*');
		forF.add('*');

		
		ArrayDeque<Character> forG = new ArrayDeque<>();
		forG.add('+');
		forG.add('+');
		forG.add('-');
		forG.add('-');
		forG.add('*');
		forG.add('*');
		forG.add('*');

		
		ArrayDeque<Character> forH = new ArrayDeque<>();
		forH.add('+');
		forH.add('+');
		forH.add('-');
		forH.add('-');
		forH.add('*');
		forH.add('*');
		forH.add('*');
		forH.add('.');
		
		
		ArrayDeque<Character> forI = new ArrayDeque<>();
		forI.add('+');
		forI.add('+');
		forI.add('-');
		forI.add('-');
		forI.add('*');
		forI.add('*');
		forI.add('*');
		forI.add('.');
		forI.add('.');
		
		
		ArrayDeque<Character> forJ = new ArrayDeque<>();
		forJ.add('+');
		forJ.add('+');
		forJ.add('-');
		forJ.add('-');
		forJ.add('*');
		forJ.add('*');
		forJ.add('*');
		forJ.add('.');
		forJ.add('.');
		forJ.add('.');
		
		
		this.data.put('a', forA);
		this.data.put('b', forB);
		this.data.put('c', forC);
		this.data.put('d', forD);
		this.data.put('e', forE);
		this.data.put('f', forF);
		this.data.put('g', forG);
		this.data.put('h', forH);
		this.data.put('i', forI);
		this.data.put('j', forJ);

	}
	
	private void convert(String tc){
		int i = 0;
		while(i < tc.length()){
			if((i+1)<tc.length()){
				if(isNumber(tc.charAt(i))){
					this.fromString.add(new Combo(tc.charAt(i+1), tc.charAt(i), this.data.get(tc.charAt(i+1))));
					//System.out.println(i);
					i+=2;
				} else{
					this.fromString.add(new Combo(tc.charAt(i), '0', this.data.get(tc.charAt(i))));
					//System.out.println(i);
					i+=1;
				}
				
			} else {
				this.fromString.add(new Combo(tc.charAt(i), '0', this.data.get(tc.charAt(i))));
				i+=1;
			}
		}
	}
	
	private boolean isNumber(char toCheck){
		switch(toCheck){
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				return true;
				
			default:
				return false;
				
		
		
		}
	}
	
	private int findMaxLength(){
		int max = 0;
		for(Combo toCheck: fromString){
			if(toCheck.getLength()>max){
				max = toCheck.getLength();
			}
		}
		
		return max;
	}
	
	private void adjustLength(int maxSize){
		for(Combo toCheck: fromString){
			toCheck.toMakeSize(maxSize);
		}
	
	}
	
	private String makeString(int max){
		String toReturn = "";
		for(int i = 0; i < max; i++){
			for(Combo toPop: fromString){
				toReturn += toPop.pop();
			}
			toReturn += "\n";
		}
		return toReturn;
	}
	
	public String toString(){
		return this.toReturn;
	}
}