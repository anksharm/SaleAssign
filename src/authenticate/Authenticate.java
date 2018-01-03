package authenticate;
import java.util.ArrayList;

import Dto.UserDetails;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;

public class Authenticate {

	
	private static final String username = "Salesforce";


	public static UserDetails getUserDetails() {
		
			Twitter twitter = null;
			UserDetails userDetails = new UserDetails(); 
			try {
				
					twitter = getAuthentication(); // should have a success check details here 
					ResponseList<Status> sList = twitter.getUserTimeline(username); 
					User user = twitter.showUser(username); // should have a success check detail here
					ArrayList<String> tweetTextList = new ArrayList<String>(); 
					
				    if(null != sList) {
				    		int count = 0; 
				    		for(Status s : sList) {
				    			if(count <= 10) {
				    				tweetTextList.add(s.getText());
				    			}
				    			count ++;
				    		} 
				    		
				    		userDetails.setText(tweetTextList);
				    		userDetails.setUserId(twitter.getId());
				    		userDetails.setUsername(twitter.getScreenName());
				    		userDetails.setProfileImageUrl(user.getProfileImageURL());
				    }
				} catch (Exception e) {
				        e.printStackTrace();
				}
			
	 return userDetails;
	}


	private static Twitter getAuthentication() {
		
		//should read the consumer Key and rest details from a file or JSON File. 
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("vkwJDy2YemNu7ZCnEG16aLV5r")
		  .setOAuthConsumerSecret("RWdqJySLUHpcM79JkmRGpbktyOjsO1zGb8UUz9oD00VmPEAtH7")
		  .setOAuthAccessToken("1557248210-KBcsUzTeUkuQd20Mc5rDRVW7DGlSKuQvSwzru05")
		  .setOAuthAccessTokenSecret("cJCakEu4pEIuoljo8EctMG73kbCHSxp21n44WZur0yQO7");
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		try {
		    twitter.verifyCredentials(); 
		    
		} catch (Exception e) {
		        e.printStackTrace();
		}
		return twitter;

	}


}
