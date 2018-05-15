/**
 * 
 */
package model;

import java.util.List;

/**
 * SocialMediaAccountList
 *
 * @author djcedrics
 * @date May 15, 2018
 */
public class SocialMediaAccountList {
	
	private List<SocialMediaAccount> socialMediaAccounts;

	/**
	 * @param socialMediaAccounts
	 */
	public SocialMediaAccountList(List<SocialMediaAccount> socialMediaAccounts) {
		super();
		this.socialMediaAccounts = socialMediaAccounts;
	}

	public List<SocialMediaAccount> getSocialMediaAccounts() {
		return socialMediaAccounts;
	}

	public void setSocialMediaAccounts(List<SocialMediaAccount> socialMediaAccounts) {
		this.socialMediaAccounts = socialMediaAccounts;
	};
	
	

}
