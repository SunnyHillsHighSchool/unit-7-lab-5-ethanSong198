//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ethan Song

import static java.lang.System.*;

public class Main
{
	public static void main( String args[] )
	{
		int[] r = {5, 12, 9, 6, 1, 4, 8, 6 };
		NumberAnalyzer test = new NumberAnalyzer( r );
		out.println(test);
		out.println("odd count = "+test.countOdds());
		out.println("even count = "+test.countEvens());
		out.println("perfect count = "+test.countPerfects()+"\n\n\n");

		//add more test cases
    int[] s = {1638, 2590, 1129, 198, 199, 16, 38, 15};
		NumberAnalyzer caseA = new NumberAnalyzer( s );
    out.println(caseA);
		out.println("odd count = "+caseA.countOdds());
		out.println("even count = "+caseA.countEvens());
		out.println("perfect count = "+caseA.countPerfects()+"\n\n\n");		

	}
}