/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import javax.swing.JPanel;

import org.junit.Test;

import model.Job;
import model.Registrable;
import model.User;
import view.Application;

/**
 * JobTest
 *
 * @author djcedrics
 * @date May 15, 2018
 */
public class JobTest {

	/**
	 * Test method for {@link model.Job#getApplicant(model.User)}.
	 */
	@Test
	public void testGetApplicant() {
		Application testApplication = new Application();
		JPanel ownedJobPostsScreen = testApplication.getOwnedJobPostsScreen();
		
		assertNotNull("Owned job posts screen has not been initialized", ownedJobPostsScreen);
		
		Registrable u1 = new User("John", "Doe", 21, "Male", "Bilkent", "Ankara", "johndoe@mail.com", "johndoe123");
		Registrable u2 = new User("Jane", "Doe", 25, "Female", "Bilkent", "Ankara", "janedoe@mail.com", "janedoe123");
		
		Job j = new Job("Software Developer", "5+ years experience", "SimSoft", u2);
		
		j.getApplicants().add((User) u1);

		assertEquals("The applicant should be in job's applicants list", j.getApplicant(u1), u1);
	}

	/**
	 * Test method for {@link model.Job#hasApplication(model.User)}.
	 */
	@Test
	public void testHasApplication() {
		
		Application testApplication = new Application();
		JPanel jobApplicationsScreen = testApplication.getJobApplicationsScreen();
		
		assertNotNull("Owned job posts screen has not been initialized", jobApplicationsScreen);
		
		User u1 = new User("John", "Doe", 21, "Male", "Bilkent", "Ankara", "johndoe@mail.com", "johndoe123");
		Registrable u2 = new User("Jane", "Doe", 25, "Female", "Bilkent", "Ankara", "janedoe@mail.com", "janedoe123");
		
		Job j = new Job("Software Developer", "5+ years experience", "SimSoft", u2);
		
		j.getApplicants().add(u1);
		
		assertTrue("Job application of user u1 cannot be found although the application is submitted.", j.hasApplication(u1));
		assertFalse("User u2 does not have job application for job j, however, u2 is found in applicants list.", j.hasApplication(u2));
		
	}
	
	
	@Test
	public void testIfJobReceivesTheApplication() {
		
		Application testApplication = new Application();
		JPanel ownedJobPostsScreen = testApplication.getOwnedJobPostsScreen();
		
		assertNotNull("Owned job posts screen has not been initialized", ownedJobPostsScreen);
		
		User u1 = new User("John", "Doe", 21, "Male", "Bilkent", "Ankara", "johndoe@mail.com", "johndoe123");
		Registrable u2 = new User("Jane", "Doe", 25, "Female", "Bilkent", "Ankara", "janedoe@mail.com", "janedoe123");
		
		Job j = new Job("Software Developer", "5+ years experience", "SimSoft", u2);
		
		u1.applyToJob(j);
		assertEquals("The applied jobs list should be 1", 1, u1.getAppliedJobs().size());
		assertEquals("The job applied should be in applied jobs list", u1.getAppliedJobs().get(u1.getAppliedJobs().size() - 1), j);
		
		
		
	}

}
