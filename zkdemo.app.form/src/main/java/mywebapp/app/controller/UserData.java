package mywebapp.app.controller;

import java.util.ArrayList;
import java.util.List;

import mywebapp.app.model.User;

public class UserData {
	
	   private final List<User> allUserData = new ArrayList<User>();

	   public List<User> getAllUserData() {
		     return allUserData;
		    }
}
