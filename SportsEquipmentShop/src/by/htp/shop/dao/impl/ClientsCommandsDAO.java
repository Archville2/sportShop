package by.htp.shop.dao.impl;

import java.util.regex.Pattern;

import by.htp.shop.bean.User;
import by.htp.shop.bean.UsersList;
import by.htp.shop.dao.ClientsDAO;
import by.htp.shop.dao.exception.DAOException;

public class ClientsCommandsDAO implements ClientsDAO {
	static final UsersList usersList = new UsersList();

	@Override
	public String regUser(String request) throws DAOException {

		Pattern pattern = Pattern.compile("\\s+");
		String[] words = pattern.split(request);

		User user = new User(words[0], words[1], words[2]);

		usersList.addClient(user);

		return "User added";
	}

	@Override
	public String printClients() throws DAOException {

		String result = String.format("%-15s %-15s %-15s\n", "Name", "Surname", "Phone");

		for (int i = 0; i < usersList.getUserListSize(); i++) {
			User user = usersList.getClient(i);
			result = result.concat(String.format("%-15s %-15s %-15s\n", user.getName(), user.getSurname(), user.getPhone()));
		}

		return result;
	}

}