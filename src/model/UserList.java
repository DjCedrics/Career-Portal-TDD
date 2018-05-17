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
public class UserList {
	
	public static ArrayList<User> users = new ArrayList<User>();
	
	public static ArrayList<User> getUsers() {
		return users;
	}

	public static void setUsers(ArrayList<User> users2) {
		users = users2;
	}

	public UserList()
	{
		users = new ArrayList<User>();
	}
	
	public void registerUser(User u)
	{
		users.add(u);
	}

}