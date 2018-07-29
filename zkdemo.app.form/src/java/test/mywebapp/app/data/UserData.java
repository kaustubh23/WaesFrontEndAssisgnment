package mywebapp.app.data;

import java.util.ArrayList;
import java.util.List;

public class UserData {
	
	 private static List<UserInfo> user = new ArrayList<UserInfo>();
	    static {
	        user.add(new UserInfo("kaustubh", "admin", 115, 43));
	        user.add(new UserInfo("ravi", "test",33, 74));
	        user.add(new UserInfo("andrew", "coder",291, 24));
	        user.add(new UserInfo("mark", "analyst",92, 28));
	        user.add(new UserInfo("bella", "hr",10, 27));
	        }
	 
	    public static List<UserInfo> getAllFoods() {
		return new ArrayList<UserInfo>(user);
	    }

}
