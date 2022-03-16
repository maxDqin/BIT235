package week11;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.princeton.cs.algs4.In;

public class MyUnitTest {
	@Test 
	// The Test annotation tells JUnit that the public void method to which 
	// it is attached can be run as a test case.
	public void testConcatenate() {
		MyUnit myUnit = new MyUnit();
		String result = myUnit.concatenate("one", "two");
		assertEquals("onetwo", result);
	}
	
	@Test 
	public void testConcatenate_1() {
		In in = new In("./week11/test.txt");
		while(in.hasNextLine()) {
			String line = in.readLine();
			String[] fields = line.split("\t");
			String res = new MyUnit().concatenate(fields[0], fields[1]);
			assertEquals(fields[2], res);
		}
	}

}
