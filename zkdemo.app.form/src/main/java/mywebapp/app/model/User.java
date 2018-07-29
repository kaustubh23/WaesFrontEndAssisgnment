package mywebapp.app.model;

import java.time.LocalDate;

public class User {
	private int select;
	private int active;
	
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	private boolean swtch;
	private int id;
	private String userName;
	private String postTitle;
	private int views;
	private int likes;
	private LocalDate createdAt;
	private int filterId;
	private String filterUserName;
	private String filterPostTitle;
	private String searchByuserName;
	public int getSelect() {
		return select;
	}
	public void setSelect(int select) {
		this.select = select;
	}
	
	public boolean isSwtch() {
		return swtch;
	}
	public void setSwtch(boolean swtch) {
		this.swtch = swtch;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public LocalDate getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
	public int getFilterId() {
		return filterId;
	}
	public void setFilterId(int filterId) {
		this.filterId = filterId;
	}
	public String getFilterUserName() {
		return filterUserName;
	}
	public void setFilterUserName(String filterUserName) {
		this.filterUserName = filterUserName;
	}
	public String getFilterPostTitle() {
		return filterPostTitle;
	}
	public void setFilterPostTitle(String filterPostTitle) {
		this.filterPostTitle = filterPostTitle;
	}
	public String getSearchByuserName() {
		return searchByuserName;
	}
	public void setSearchByuserName(String searchByuserName) {
		this.searchByuserName = searchByuserName;
	}


}
