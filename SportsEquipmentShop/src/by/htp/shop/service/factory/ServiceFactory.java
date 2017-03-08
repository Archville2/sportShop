package by.htp.shop.service.factory;

import by.htp.shop.service.impl.InitService;
import by.htp.shop.service.impl.PrintClientsService;
import by.htp.shop.service.impl.RegUserService;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final RegUserService regUserService = new RegUserService();
	private final PrintClientsService printClientsService = new PrintClientsService();
	private final InitService initService = new InitService();

	private ServiceFactory() {
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

	public RegUserService getRegUserService() {
		return regUserService;
	}

	public PrintClientsService getPrintClientsService() {
		return printClientsService;
	}
	
	public InitService getInitService() {
		return initService;
	}
}
