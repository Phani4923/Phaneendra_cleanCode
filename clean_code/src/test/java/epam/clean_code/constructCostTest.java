package epam.clean_code;

import static org.junit.Assert.*;

import org.junit.Test;

public class constructCostTest {

	constructCost cost=new constructCost();
	@Test
	public void testCalculateCost() {
		assertEquals(2178000.0,cost.calculateCost(3, 871.2, true),0);
	}
}
