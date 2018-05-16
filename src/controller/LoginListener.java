package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import junit.framework.*;
import javax.swing.JPanel;
public class LoginListener implements ActionListener {
	//Variables
	private JPanel login;
	private JPanel home;
	
	public JPanel getLogin() {
		return login;
	}

	public void setLogin(JPanel login) {
		this.login = login;
	}

	public JPanel getHome() {
		return home;
	}

	public void setHome(JPanel home) {
		this.home = home;
	}

	public LoginListener() {
		super();
		this.login = null;
		this.home = null;
	}

	public LoginListener(JPanel login, JPanel home) {
		super();
		this.login = login;
		this.home = home;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		login.setVisible(false);
		home.setVisible(true);
		
	}

	
}
