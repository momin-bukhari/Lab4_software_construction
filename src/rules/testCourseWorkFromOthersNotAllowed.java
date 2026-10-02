package rules;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCourseWorkFromOthersNotAllowed {

	@Test public void testPublicCitedCodeAllowed() {
		assertTrue("Expected true: cited public code that is not required", 
				RulesOf6005.mayUseCodeInAssignment(false, true, false, true, false));
		}
}