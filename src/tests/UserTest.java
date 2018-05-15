/**
 * 
 */
package tests;

import static org.junit.Assert.*;
import model.Job;
import model.User;

import org.junit.Test;

/**
 * UserTest
 *
 * @author djcedrics
 * @date May 15, 2018
 */
public class UserTest {

	/**
	 * Test method for {@link model.User#applyToJob(model.Job)}.
	 */
	@Test
	public void testApplyToJob() {
		User u1 = new User("John", "Doe", 21, "Male", "Bilkent", "Ankara", "johndoe@mail.com", "johndoe123");
		User u2 = new User("Jane", "Doe", 25, "Female", "Bilkent", "Ankara", "janedoe@mail.com", "janedoe123");
		
		Job j = new Job("Software Developer", "5+ years experience", "SimSoft", u2);
		
		assertEquals("SimSoft Software Developer job should be in applied jobs list of John Doe", j, u1.applyToJob(j));
	}
	

	/**
	 * Test method for {@link model.User#cancelApplicationToJob(model.Job)}.
	 */
	@Test
	public void testCancelApplicationToJob() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link model.User#postJob(model.Job)}.
	 */
	@Test
	public void testPostJob() {
		fail("Not yet implemented");
	}

}
