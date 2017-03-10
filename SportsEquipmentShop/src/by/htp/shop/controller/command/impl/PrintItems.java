package by.htp.shop.controller.command.impl;

import by.htp.shop.controller.command.Command;
import by.htp.shop.controller.exception.ControllerException;
import by.htp.shop.service.exception.ServiceException;
import by.htp.shop.service.factory.ServiceFactory;
import by.htp.shop.service.impl.PrintClientsService;
import by.htp.shop.service.impl.PrintItemsService;

public class PrintItems implements Command{
	
	@Override
	public String execute(String request) throws ControllerException {
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		PrintItemsService printItemsService = serviceFactory.getPrintItemsService();

		try {
			return printItemsService.printItems(request);
		} catch (ServiceException e) {
			throw new ControllerException(e.getMessage(), e);
		}
	}
}
