package rules;

import static org.junit.Assert.*;

import org.junit.Test;

public class testImplementationRequiredNotAllowed {

	@Test public void testCourseWorkFromOthersNotAllowed() {
		assertFalse("Expected false: someone else's 6.005 course work",
				RulesOf6005.mayUseCodeInAssignment(false, true, true, true, false));
	
	}

}