package rules;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPublicCitedCodeAllowed {

	@Test public void testImplementationRequiredNotAllowed() {
		assertFalse("Expected false: assignment requires your own implementation", 
				RulesOf6005.mayUseCodeInAssignment(false, true, false, true, true));
		}

}