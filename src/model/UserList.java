/**
 * 
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * UserList
 *
 * @author djcedrics
 * @date May 15, 2018
 */
public class UserList implements Serializable{
	
	private List<User> users;
	
	public UserList()
	{
		users = new ArrayList<User>();
	}
	
	public void registerUser(User u)
	{
		users.add(u);
	}

}
