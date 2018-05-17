/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * UserTest
 *
 * @author Baris Poyraz, Efe Ulas Akay Seyitoglu, Firat Sivrikaya
 * @date May 12, 2018
 */
public class SocialMediaAccountList {
	
	private static ArrayList<SocialMediaAccount> socialMediaAccounts = new ArrayList<SocialMediaAccount>();

	/**
	 * @param socialMediaAccounts
	 */
	public SocialMediaAccountList(ArrayList<SocialMediaAccount> socialMediaAccounts) {
		super();
		this.socialMediaAccounts = socialMediaAccounts;
	}

	public static ArrayList<SocialMediaAccount> getSocialMediaAccounts() {
		return socialMediaAccounts;
	}

	public void  setSocialMediaAccounts(ArrayList<SocialMediaAccount> socialMediaAccounts) {
		this.socialMediaAccounts = socialMediaAccounts;
	};
	
	

}
