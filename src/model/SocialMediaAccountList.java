/**
 * 
 */
package model;

import java.util.List;

/**
 * UserTest
 *
 * @author Baris Poyraz, Efe Ulas Akay Seyitoglu, Firat Sivrikaya
 * @date May 12, 2018
 */
public class SocialMediaAccountList {
	
	private static List<SocialMediaAccount> socialMediaAccounts;

	/**
	 * @param socialMediaAccounts
	 */
	public SocialMediaAccountList(List<SocialMediaAccount> socialMediaAccounts) {
		super();
		this.socialMediaAccounts = socialMediaAccounts;
	}

	public static List<SocialMediaAccount> getSocialMediaAccounts() {
		return socialMediaAccounts;
	}

	public void  setSocialMediaAccounts(List<SocialMediaAccount> socialMediaAccounts) {
		this.socialMediaAccounts = socialMediaAccounts;
	};
	
	

}
