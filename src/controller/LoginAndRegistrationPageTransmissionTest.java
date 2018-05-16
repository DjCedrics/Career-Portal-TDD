package controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginAndRegistrationPageTransmissionTest {

	@Test
	public void test() {
		LoginListener test1 = new LoginListener();
		assertNotNull(test1.getHome());
		assertNotNull(test1.getLogin());
	}

}
