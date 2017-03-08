package by.htp.shop.service.impl;

import by.htp.shop.dao.EquipmentDAO;
import by.htp.shop.dao.exception.DAOException;
import by.htp.shop.dao.factory.DAOFactory;
import by.htp.shop.service.exception.ServiceException;

public class InitService {
	public String init(String request) throws ServiceException {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		EquipmentDAO equipmentDAO = daoObjectFactory.getEquipmentDAO();

		String result;

		try {
			return equipmentDAO.init(request);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
}
