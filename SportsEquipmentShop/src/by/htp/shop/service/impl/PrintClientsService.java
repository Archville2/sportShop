package by.htp.shop.service.impl;

import by.htp.shop.dao.ClientsDAO;
import by.htp.shop.dao.exception.DAOException;
import by.htp.shop.dao.factory.DAOFactory;
import by.htp.shop.service.exception.ServiceException;

public class PrintClientsService {

	public String printClients(String request) throws ServiceException {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		ClientsDAO clientsDAO = daoObjectFactory.getClientsDAO();

		String result;

		try {
			return clientsDAO.printClients();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}

}
