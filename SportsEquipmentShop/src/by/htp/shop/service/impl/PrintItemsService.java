package by.htp.shop.service.impl;

import by.htp.shop.dao.EquipmentDAO;
import by.htp.shop.dao.exception.DAOException;
import by.htp.shop.dao.factory.DAOFactory;
import by.htp.shop.service.exception.ServiceException;

public class PrintItemsService {
	public String printItems(String request) throws ServiceException {
		DAOFactory daoObjectFactory = DAOFactory.getInstance();
		EquipmentDAO equipmentDAO = daoObjectFactory.getEquipmentDAO();

		try {
			String result= equipmentDAO.getEquipmentList(request);
			
			System.out.println(result);
			
			return "print ok";
			
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
}
