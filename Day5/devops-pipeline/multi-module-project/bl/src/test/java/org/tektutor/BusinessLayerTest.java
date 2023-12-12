package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

public class BusinessLayerTest {

	@Test
	public void testGetModuleName() {

		BusinessLayer bl = new BusinessLayer();
		String expectedResponse = "BusinessLayer";
		String actualResponse   = bl.getModuleName();
		assertEquals ( expectedResponse, actualResponse );

	}
}
