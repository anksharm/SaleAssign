package Dto;

import java.util.ArrayList;

public class UserDetails {

	String username; 
	Long userId; 
	ArrayList<String> text; 
	String profileImageUrl;
	
	public String getUsername() {
		return username;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public ArrayList<String> getText() {
		return text;
	}
	public void setText(ArrayList<String> text) {
		this.text = text;
	}
	public String getProfileImageUrl() {
		return profileImageUrl;
	}
	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}
	
	
}
