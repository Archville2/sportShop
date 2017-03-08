package by.htp.shop.dao;

import by.htp.shop.bean.Client;

public interface ClientsListDAO {
	public int getClientListSize();

	public void addClient(Client client);

	public Client getClient(int position);
}
