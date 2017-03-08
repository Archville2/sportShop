package by.htp.shop.bean;

import java.util.ArrayList;
import java.util.List;

public class UsersList {
	private List<User> users = new ArrayList<>();

	public UsersList() {
	}

	public UsersList(User user) {
		users.add(user);
	}

	public int getUserListSize() {
		return users.size();
	}

	public void addClient(User user) {
		users.add(user);
	}

	public User getClient(int position) {

		if (getUserListSize() > position) {
			return users.get(position);
		} else {
			return null;
		}
	}

}
