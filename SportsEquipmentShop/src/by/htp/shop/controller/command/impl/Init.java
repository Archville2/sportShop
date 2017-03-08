package by.htp.shop.controller.command.impl;

import by.htp.shop.controller.command.Command;
import by.htp.shop.controller.exception.ControllerException;
import by.htp.shop.service.exception.ServiceException;
import by.htp.shop.service.factory.ServiceFactory;
import by.htp.shop.service.impl.InitService;

public class Init implements Command {

	@Override
	public String execute(String request) throws ControllerException {
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		InitService initService = serviceFactory.getInitService();

		try {
			return initService.init(request);
		} catch (ServiceException e) {
			throw new ControllerException(e.getMessage(), e);
		}
	}

}
