package selab10testpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class teststringno {

	@Test
	public void test() {
		labtestcase junit = new labtestcase();
		String result = junit.AddStrigs("Hello", " World");
		assertEquals("Hello World",result);
	}

}