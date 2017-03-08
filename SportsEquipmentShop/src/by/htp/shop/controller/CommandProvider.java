package by.htp.shop.controller;

import java.util.Map;

import by.htp.shop.controller.command.Command;
import by.htp.shop.controller.command.CommandName;
import by.htp.shop.controller.command.impl.Init;
import by.htp.shop.controller.command.impl.PrintClients;
import by.htp.shop.controller.command.impl.RegUser;
import by.htp.shop.controller.exception.ControllerException;

import java.util.HashMap;

final class CommandProvider {
	private final Map<CommandName, Command> repository = new HashMap<>();

	CommandProvider() {
		repository.put(CommandName.REG_USER, new RegUser());
		repository.put(CommandName.PRINT_CLIENTS, new PrintClients());
		repository.put(CommandName.INIT, new Init());
	}

	Command getCommand(String name) throws ControllerException {

		CommandName commandName = CommandName.valueOf(name.toUpperCase());

		return repository.get(commandName);
	}
}