package selab10testpackage;

import static org.junit.Assert.*;

public class testaddno {

	public void test() {
		labtestcase junit = new labtestcase();
		int result = junit.AddNumbers(100, 200);
		assertEquals(300,result);
	}

}
