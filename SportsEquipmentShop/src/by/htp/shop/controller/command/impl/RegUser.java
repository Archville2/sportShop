package by.htp.shop.controller.command.impl;

import by.htp.shop.controller.command.Command;
import by.htp.shop.controller.exception.ControllerException;
import by.htp.shop.service.exception.ServiceException;
import by.htp.shop.service.factory.ServiceFactory;
import by.htp.shop.service.impl.RegUserService;

public class RegUser implements Command {

	@Override
	public String execute(String request) throws ControllerException {
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		RegUserService regUserService = serviceFactory.getRegUserService();

		try {
			return regUserService.regUser(request);
		} catch (ServiceException e) {
			throw new ControllerException(e.getMessage(), e);
		}
	}
}
