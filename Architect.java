import java.util.Deque;
import java.util.HashMap;

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

	private HashMap<Character, Deque<Character>> data;
	private String toConvert;
	private String toReturn;
	private ArrayList<Combo> fromString;
	
	public Architect(String toConvert){
		this.toConvert = toConvert;
		convert(this.toConvert);
		Deque<Character> forA = new Deque<>();
		forA.add('+');
		
		Deque<Character> forB = new Deque<>();
		forB.add('+');
		forB.add('+');
		
		Deque<Character> forC = new Deque<>();
		forC.add('+');
		forC.add('+');
		forC.add('-');
		
		Deque<Character> forD = new Deque<>();
		forD.add('+');
		forD.add('+');
		forD.add('-');
		forD.add('-');
		
		Deque<Character> forE = new Deque<>();
		forE.add('+');
		forE.add('+');
		forE.add('-');
		forE.add('-');
		forE.add('*');
		
		
		Deque<Character> forF = new Deque<>();
		forF.add('+');
		forF.add('+');
		forF.add('-');
		forF.add('-');
		forF.add('*');
		forF.add('*');

		
		Deque<Character> forG = new Deque<>();
		forG.add('+');
		forG.add('+');
		forG.add('-');
		forG.add('-');
		forG.add('*');
		forG.add('*');
		forG.add('*');

		
		Deque<Character> forH = new Deque<>();
		forH.add('+');
		forH.add('+');
		forH.add('-');
		forH.add('-');
		forH.add('*');
		forH.add('*');
		forH.add('*');
		forH.add('.');
		
		
		Deque<Character> forI = new Deque<>();
		forI.add('+');
		forI.add('+');
		forI.add('-');
		forI.add('-');
		forI.add('*');
		forI.add('*');
		forI.add('*');
		forI.add('.');
		forI.add('.');
		
		
		Deque<Character> forJ = new Deque<>();
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

		for(Combo toTest:this.fromString){
			System.out.println(toTest);
		}

//j is ++--***...
		
	}
	
	private void convert(String tc){
		int i = 0;
		while(i < tc.length()){
			if(i+1<tc.length()){
				if(isNumber(tc.charAt(i+1))){
					this.fromString.add(new Combo(tc.charAt(i), tc.charAt(i+1)));
					i+=2;
				} else{
					this.fromString.add(new Combo(tc.charAt(i), '0'));
					i+=1;
				}
				
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
				break;
			default:
				return false;
				break;
		
		
		}
	}
}