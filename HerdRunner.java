//© A+ Computer Science
// www.apluscompsci.com

//ArrayList of User-defined Classes

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;

public class HerdRunner
{
	public static void main ( String[] args )
	{
		Herd bunch = new Herd();
		bunch.add(73);
		bunch.add(75);
		bunch.add(76);
		System.out.println(bunch);
		System.out.println(bunch.countBigOnes());
  }
}