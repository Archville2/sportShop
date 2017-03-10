package by.htp.shop.service.impl;

import by.htp.shop.dao.ClientsDAO;
import by.htp.shop.dao.exception.DAOException;
import by.htp.shop.dao.factory.DAOFactory;
import by.htp.shop.service.exception.ServiceException;

public class RegUserService {

	public String regUser(String request) throws ServiceException {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		ClientsDAO clientsDAO = daoObjectFactory.getClientsDAO();
				
		try {
			return clientsDAO.regUser(request);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
}
