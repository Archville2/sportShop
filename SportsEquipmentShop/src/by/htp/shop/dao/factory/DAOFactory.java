package by.htp.shop.dao.factory;

import by.htp.shop.dao.ClientsDAO;
import by.htp.shop.dao.EquipmentDAO;
import by.htp.shop.dao.impl.ClientsCommandsDAO;
import by.htp.shop.dao.impl.EquipmentCommandsDAO;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final ClientsDAO clientsDAO = new ClientsCommandsDAO();
	private final EquipmentDAO equipmentDAO = new EquipmentCommandsDAO();

	private DAOFactory() {
	}

	public static DAOFactory getInstance() {
		return instance;
	}

	public ClientsDAO getClientsDAO() {
		return clientsDAO;
	}

	public EquipmentDAO getEquipmentDAO() {
		return equipmentDAO;
	}
}
