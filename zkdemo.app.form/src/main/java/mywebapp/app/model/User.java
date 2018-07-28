package mywebapp.app.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Comparator;

public class User implements Comparator<Object>, Serializable {
	  private int type = 0;
	  
private int id;

private	String userName;
private String postTitle;
private int views;
private int likes;
private LocalDate createdAt;
private boolean asc = true;


public User(boolean asc, int type) {
    this.asc = asc;
    this.type = type;
}

public int getType() {
    return type;
}

public void setType(int type) {
    this.type = type;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public LocalDate getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(LocalDate createdAt) {
	this.createdAt = createdAt;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPostTitle() {
	return postTitle;
}
public void setPostTitle(String postTitle) {
	this.postTitle = postTitle;
}
public int getViews() {
	return views;
}
public void setViews(int views) {
	this.views = views;
}
public int getLikes() {
	return likes;
}
public void setLikes(int likes) {
	this.likes = likes;
}
public int compare(Object o1, Object o2) {
	User contributor1 = (User) o1;
	User contributor2 = (User) o2;
    switch (type) {
    case 1: // Compare Title
        return contributor1.getUserName().compareTo(contributor2.getUserName()) * (asc ? 1 : -1);
    case 2: // Compare First Name
        return contributor1.getUserName().compareTo(contributor2.getUserName()) * (asc ? 1 : -1);
  /*  case 3: // Compare Last Name
        return contributor1.getLastName().compareTo(contributor2.getLastName()) * (asc ? 1 : -1);
    case 4: // Compare Extension
        return contributor1.getExtension().compareTo(contributor2.getExtension()) * (asc ? 1 : -1);
*/     default: // Full Name
        return contributor1.getUserName().compareTo(contributor2.getUserName()) * (asc ? 1 : -1);
    }
}
}
