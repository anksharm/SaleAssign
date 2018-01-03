package src;


import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Dto.UserDetails;
import authenticate.Authenticate;

@RestController
@RequestMapping("/SaleTweetServer")
public class SimpleRestController {

	// Logger instance
	private static final Log  logger = null;
	
	@Autowired
	public Authenticate authenticate;
	
	@RequestMapping(value = "/gettweet")
	public @ResponseBody UserDetails getTweet() {
		
		
		return authenticate.getUserDetails();

	}

	private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "Error handling";
    }

    public String getErrorPath() {
        return PATH;
    }

}
