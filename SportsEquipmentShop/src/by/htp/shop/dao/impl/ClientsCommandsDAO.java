package by.htp.shop.dao.impl;

import java.util.regex.Pattern;

import by.htp.shop.bean.Client;
import by.htp.shop.dao.ClientsDAO;
import by.htp.shop.dao.ClientsListDAO;
import by.htp.shop.dao.exception.DAOException;
import by.htp.shop.dao.provider.ClientProvider;

public class ClientsCommandsDAO implements ClientsDAO {
	ClientProvider clientProvider = ClientProvider.getInstance();
	ClientsListDAO clientsList = clientProvider.getClientsListDAO();
	
	@Override
	public String regUser(String request) throws DAOException {
		Pattern pattern = Pattern.compile("\\s+");
		String[] words = pattern.split(request);

		Client client = new Client(words[0], words[1], words[2]);

		clientsList.addClient(client);

		return "User added";
	}

	@Override
	public String printClients() throws DAOException {

		String result = String.format("%-15s %-15s %-15s\n", "Name", "Surname", "Phone");

		for (int i = 0; i < clientsList.getClientListSize(); i++) {
			Client client = clientsList.getClient(i);
			result = result.concat(
					String.format("%-15s %-15s %-15s\n", client.getName(), client.getSurname(), client.getPhone()));
		}

		return result;
	}

}