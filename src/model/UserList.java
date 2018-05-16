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
	
	public static List<User> users;
	
	public static List<User> getUsers() {
		return users;
	}

	public static void setUsers(List<User> users2) {
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
