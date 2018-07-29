package mywebapp.app.data;

public class UserInfo {
	
	public UserInfo(String userName, String postTitle, int views, int likes){
		this.userName=userName;
		this.postTitle=postTitle;
		this.views=views;
		this.likes=likes;
	}
	
	private String userName;
	private String postTitle;
	private int views;
	private int likes;
	
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

}
