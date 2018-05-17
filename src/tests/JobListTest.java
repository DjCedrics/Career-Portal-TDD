package tests;

import static org.junit.Assert.*;

import javax.swing.JPanel;

import org.junit.Test;

import model.Job;
import model.JobList;
import model.Registrable;
import model.User;
import view.Application;

public class JobListTest {

	@Test
	public void testSearchJob() {
		
		Application testApplication = new Application();
		JPanel jobSearchScreen = testApplication.getJobSearchScreen();
		
		assertNotNull("Job search screen has not been initialized", jobSearchScreen);
		
		Registrable u1 = new User("Jane", "Doe", 25, "Female", "Bilkent", "Ankara", "janedoe@mail.com", "janedoe123");
		
		Job j1 = new Job("Software Developer", "5+ years experience", "SimSoft", u1);
		Job j2 = new Job("Software Developer", "5+ years experience", "Microsoft", u1);
		Job j3 = new Job("Software Developer", "5+ years experience", "Google", u1);
		Job j4 = new Job("Software Developer", "5+ years experience", "Uber", u1);
		
		
		JobList.jobsPosted.add(j1);
		JobList.jobsPosted.add(j2);
		JobList.jobsPosted.add(j3);
		
		assertEquals("Job j1 could not be found in jobs list", j1, JobList.searchJob(j1));
		assertEquals("Job j2 could not be found in jobs list", j2, JobList.searchJob(j2));
		assertEquals("Job j3 could not be found in jobs list", j3, JobList.searchJob(j3));
		assertNotEquals("Job j4 found in jobs list, however it should not be found", j4, JobList.searchJob(j1));
		
		
	}

}
