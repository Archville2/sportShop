package by.htp.shop.dao;

import by.htp.shop.dao.exception.DAOException;

public interface ClientsDAO {
	String regUser(String request) throws DAOException;
	
	String printClients() throws DAOException;
}