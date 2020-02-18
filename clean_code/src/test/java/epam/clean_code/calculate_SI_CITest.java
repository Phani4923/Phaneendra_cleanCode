package epam.clean_code;
import org.junit.*;

import junit.framework.TestCase;
public class calculate_SI_CITest extends TestCase {
	
	calculate_SI_CI calculate=new calculate_SI_CI();
	@Test
	public void testSimpleIntrest(){
		assertEquals(100.0, calculate.simpleIntrest(100, 1, 0));
	}

	public void testCompoundIntrest() {
		assertEquals(24.0, calculate.compoundIntrest(1200, 1, 2));
	}

}
