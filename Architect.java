import java.util.Queue;

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

	private Map<Character, Deque<Character>> data;
	private String toConvert;
	private String toReturn;
	
	public Architect(String toConvert){
		this.toConvert = toConvert;
		
		Queue<Character> forA = new Queue<>();
		forA.add('+');
		
		Queue<Character> forB = new Queue<>();
		forB.add('+');
		forB.add('+');
		
		Queue<Character> forC = new Queue<>();
		forC.add('+');
		forC.add('+');
		forC.add('-');
		
		Queue<Character> forD = new Queue<>();
		forD.add('+');
		forD.add('+');
		forD.add('-');
		forD.add('-');
		
		Queue<Character> forE = new Queue<>();
		forE.add('+');
		forE.add('+');
		forE.add('-');
		forE.add('-');
		forE.add('*');
		
		
		Queue<Character> forF = new Queue<>();
		forF.add('+');
		forF.add('+');
		forF.add('-');
		forF.add('-');
		forF.add('*');
		forF.add('*');

		
		Queue<Character> forG = new Queue<>();
		forG.add('+');
		forG.add('+');
		forG.add('-');
		forG.add('-');
		forG.add('*');
		forG.add('*');
		forG.add('*');

		
		Queue<Character> forH = new Queue<>();
		forH.add('+');
		forH.add('+');
		forH.add('-');
		forH.add('-');
		forH.add('*');
		forH.add('*');
		forH.add('*');
		forH.add('.');
		
		
		Queue<Character> forI = new Queue<>();
		forI.add('+');
		forI.add('+');
		forI.add('-');
		forI.add('-');
		forI.add('*');
		forI.add('*');
		forI.add('*');
		forI.add('.');
		forI.add('.');
		
		
		
		
		
		




//j is ++--***...
		
	}

}