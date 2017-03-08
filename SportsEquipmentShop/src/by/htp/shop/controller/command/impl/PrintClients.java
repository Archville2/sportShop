package by.htp.shop.controller.command.impl;

import by.htp.shop.controller.command.Command;
import by.htp.shop.controller.exception.ControllerException;
import by.htp.shop.service.exception.ServiceException;
import by.htp.shop.service.factory.ServiceFactory;
import by.htp.shop.service.impl.PrintClientsService;

public class PrintClients implements Command {

	@Override
	public String execute(String request) throws ControllerException {
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		PrintClientsService printClientsService = serviceFactory.getPrintClientsService();

		try {
			return printClientsService.printClients(request);
		} catch (ServiceException e) {
			throw new ControllerException(e.getMessage(), e);
		}
	}
}
