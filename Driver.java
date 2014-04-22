public class Driver {

	public static void main(String[] args){
		String testString = "j3f3e3e3d3d3c3cee3c3c3d3d3e3e3f3fjij3f3f3e3e3d3d3c3cee3c3c3d3d3e3e3fj";
		
		Architect toRun = new Architect(testString);
		
		System.out.println(toRun);
		String actualString = "";
		actualString += ".                 . .                 .\n";
		actualString += ".*              **...**              *.\n";
		actualString += ".***          ****...****          ***.\n";
		actualString += "*-----      ------***------      -----*\n";
		actualString += "*-------  --------***--------  -------*\n";
		actualString += "*+++++++**++++++++***++++++++**+++++++*\n";
		actualString += "-+++++++--++++++++---++++++++--+++++++-\n";
		actualString += "-       --        ---        --       -\n";
		actualString += "+       ++        +++        ++       +\n";
		actualString += "+       ++        +++        ++       +\n";
		if(toRun.toString().equals(actualString)){
		
			System.out.println("It looks like it Works");
		} else{
			System.out.println("There is a problem");
		}
	}

}