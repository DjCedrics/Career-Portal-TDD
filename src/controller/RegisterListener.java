package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import junit.framework.*;
import javax.swing.JPanel;
public class RegisterListener implements ActionListener {
	//Variables
	private JPanel register;
	private JPanel home;


	public RegisterListener() {
		super();
		this.register = null;
		this.home = null;
	}

	public RegisterListener(JPanel register, JPanel home) {
		super();
		this.register = register;
		this.home = home;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//todo
		register.setVisible(false);
		home.setVisible(true);
		
	}

	
}
