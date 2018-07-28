package mywebapp.app.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;

import mywebapp.app.model.User;

public class SearchController extends SelectorComposer<Component> {

	private static final long serialVersionUID = 1L;

	/*
	 * @Wire private Textbox userNameTextbox;
	 * 
	 * @Wire private Textbox postTitleTextbox;
	 * 
	 * @Wire private Textbox viewsTextbox;
	 * 
	 * @Wire private Textbox likesTextbox;
	 */
	// private boolean isAddNew = false;

	private List<User> allUserData = new ArrayList<User>();

	public List<User> getAllUserData() {
		return allUserData;
	}

	public void setAllUserData(List<User> allUserData) {
		this.allUserData = allUserData;
		BindUtils.postNotifyChange(null, null, this, "allUserData");
	}

	// private UserData data = new UserData();

	// private ListModelList<User> listModel;

	@Command
	@NotifyChange({ "allUserData" })
	public void sortByID() {

		sort(1);
	}

	@Command
	@NotifyChange({ "allUserData" })
	public void sortByUserName() {

		sort(2);
	}

	@Command
	@NotifyChange({ "allUserData" })
	public void sortByProfileTitle() {

		sort(3);
	}

	@Command
	@NotifyChange({ "allUserData" })
	public void sortByViews() {

		sort(4);
	}

	@Command
	@NotifyChange({ "allUserData" })
	public void sortByLikes() {

		sort(5);
	}

	@Command
	@NotifyChange({ "allUserData" })
	public void sortByCreateAt() {

		sort(6);
	}

	public void sort(int type) {
		if (isSwtch()) {
			setSwtch(false);
		} else {
			setSwtch(true);
		}
		Collections.sort(getAllUserData(), (o1, o2) -> {
			switch (type) {
			case 1: // Compare Title
				return new Integer(o1.getId()).compareTo(o2.getId()) * (isSwtch() ? 1 : -1);
			case 2: // Compare First Name
				return o1.getUserName().compareTo(o2.getUserName()) * (isSwtch() ? 1 : -1);
			case 3: // Compare Last Name
				return o1.getPostTitle().compareTo(o2.getPostTitle()) * (isSwtch() ? 1 : -1);
			case 4: // Compare Extension
				return new Integer(o1.getViews()).compareTo(o2.getViews()) * (isSwtch() ? 1 : -1);
			case 5: // Full Name
				return new Integer(o1.getLikes()).compareTo(o2.getLikes()) * (isSwtch() ? 1 : -1);
			case 6: // Full Name
				return o1.getCreatedAt().compareTo(o2.getCreatedAt()) * (isSwtch() ? 1 : -1);
			default: // Full Name
				return new Integer(o1.getLikes()).compareTo(o2.getLikes()) * (isSwtch() ? 1 : -1);

			}

			/*
			 * int value1 = o1.getUserName().compareTo(o2.getUserName()); if
			 * (value1 == 0) { int
			 * value2=o1.getUserName().compareTo(o2.getUserName()); return
			 * value2; } return value1;
			 */ });

	}

	@Command
	@NotifyChange({ "allUserData" })
	public void onAddNew() {
		setVisible(true);
		List<User> userList = new ArrayList<User>();
		List<User> userListUpdate = new ArrayList<User>();
		User user = new User(false, 0);
		user.setId(getAllUserData().size() + 1);
		user.setLikes(getLikes());
		user.setUserName(getUserName());
		user.setPostTitle(getPostTitle());
		user.setViews(getViews());

		LocalDate localDate = LocalDate.now();
		user.setCreatedAt(localDate);
		// listModel.add(user);

		userList.add(user);
		if (getAllUserData() != null && !getAllUserData().isEmpty()) {
			userListUpdate = getAllUserData();
			userListUpdate.addAll(getAllUserData().size(), userList);
			setAllUserData(userListUpdate);
		} else {
			setAllUserData(userList);
		}

	}

	/*
	 * @Wire private Label modelLabel;
	 * 
	 * @Wire private Label makeLabel;
	 * 
	 * @Wire private Label priceLabel;
	 * 
	 * @Wire private Label descriptionLabel;
	 * 
	 * @Wire private Image previewImage;
	 * 
	 * @Wire private Component detailBox;
	 */

	@Init
	public void init() {
		setVisible(false);
		/*
		 * ListModelList<User> userList = new ListModelList<User>(); User user =
		 * new User(); user.setId(1); user.setLikes(2);
		 * user.setUserName("test"); user.setPostTitle("title");
		 * 
		 * LocalDate localDate = LocalDate.now(); user.setCreatedAt(localDate);
		 * //listModel.add(user);
		 * 
		 * userList.add(user); setAllUserData(userList);
		 */
		// init your model here....
	}

	/* private CarService carService = new CarServiceImpl(); */

	/*
	 * @Listen("onClick = #searchButton") public void search() {
	 * 
	 * ListModelList<User> userList = new ListModelList<User>(); User user = new
	 * User(); user.setId(1);
	 * user.setLikes(Integer.parseInt(likesTextbox.getValue()));
	 * 
	 * LocalDate localDate = LocalDate.now(); user.setCreatedAt(localDate);
	 * //listModel.add(user);
	 * 
	 * userList.add(user); setAllUserData(userList);
	 * 
	 * }
	 */

	private boolean visible;
	private boolean swtch;
	private int id;
	private String userName;
	private String postTitle;
	private int views;
	private int likes;
	private LocalDate createdAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		BindUtils.postNotifyChange(null, null, this, "id");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		BindUtils.postNotifyChange(null, null, this, "userName");
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
		BindUtils.postNotifyChange(null, null, this, "postTitle");
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
		BindUtils.postNotifyChange(null, null, this, "view");
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
		BindUtils.postNotifyChange(null, null, this, "likes");
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
		BindUtils.postNotifyChange(null, null, this, "createAt");
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
		BindUtils.postNotifyChange(null, null, this, "visible");
	}

	public boolean isSwtch() {
		return swtch;
	}

	public void setSwtch(boolean swtch) {
		this.swtch = swtch;
		BindUtils.postNotifyChange(null, null, this, "swtch");
	}

}
