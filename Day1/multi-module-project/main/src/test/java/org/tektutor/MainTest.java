package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

	@Test
	public void testGetModuleName() {

		Main mainObj = new Main();
		String expectedResponse = "Main";
		String actualResponse   = mainObj.getModuleName();
		assertEquals ( expectedResponse, actualResponse );

	}
}
