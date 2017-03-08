package by.htp.shop.bean;

import java.util.ArrayList;
import java.util.List;

import by.htp.shop.dao.ClientsListDAO;

public class ClientsList implements ClientsListDAO {
	private List<Client> clients = new ArrayList<>();

	public ClientsList() {
	}

	public ClientsList(Client user) {
		clients.add(user);
	}

	public int getClientListSize() {
		return clients.size();
	}

	public void addClient(Client client) {
		clients.add(client);
	}

	public Client getClient(int position) {

		if (getClientListSize() > position) {
			return clients.get(position);
		} else {
			return null;
		}
	}

}
