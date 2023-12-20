package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import functionality.Employee;
import functionality.Shift;

/**
 * A class for testing the Employee class.
 * 
 * @author John Ryder
 * @version 1.0
 */
class TestEmployee {

	@Test
	void testBasicConstructor() {
		Employee test = new Employee("test", 10);
		assertEquals("test", test.getName());
		assertEquals(10, test.getAge());
		assertEquals(0, test.getShifts().size());
		assertEquals("", test.getNote());
	}
	
	@Test
	void testEnhancedConstructor() {
		ArrayList<Shift> testShifts = new ArrayList<>();
		
	}

}
