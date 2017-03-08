package by.htp.shop.dao.provider;

import by.htp.shop.bean.ClientsList;
import by.htp.shop.dao.ClientsListDAO;

public class ClientProvider {
	private static final ClientProvider instance = new ClientProvider();
	private static ClientsListDAO clientsListDAO = new ClientsList();

	public static ClientProvider getInstance() {
		return instance;
	}

	public ClientsListDAO getClientsListDAO() {
		return clientsListDAO;
	}
}